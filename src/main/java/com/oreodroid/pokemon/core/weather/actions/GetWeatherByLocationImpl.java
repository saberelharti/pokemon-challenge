package com.oreodroid.pokemon.core.weather.actions;

import com.oreodroid.pokemon.core.pokemon.model.PokemonType;
import com.oreodroid.pokemon.core.pokemon.usecases.GetPokemonNameByType;
import com.oreodroid.pokemon.core.weather.model.Weather;
import com.oreodroid.pokemon.core.weather.port.OpenWeatherPort;
import com.oreodroid.pokemon.core.weather.usecases.GetWeatherByLocation;
import lombok.AllArgsConstructor;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import javax.inject.Named;

@Named
@AllArgsConstructor
public class GetWeatherByLocationImpl implements GetWeatherByLocation {

    private final OpenWeatherPort openWeatherPort;
    private final GetPokemonNameByType getPokemonNameByType;

    @Override
    public Weather handle(String location) {

        try {

            Weather weather = openWeatherPort.getWeatherByLocation(location);
            PokemonType pokemonType = getPokemonTypeFromWeather(weather);
            String pokemonName = getPokemonNameByType.handle(pokemonType.name().toLowerCase());
            weather.setPokemon(pokemonName);
            return weather;
        } catch (HttpClientErrorException exception) {
            throw new ResponseStatusException(exception.getStatusCode(), exception.getMessage(), exception);
        }
    }

    private PokemonType getPokemonTypeFromWeather(Weather weather) {

        if (weather.isRaining())
            return PokemonType.ELECTRIC;

        float temperature = weather.getTemperature();

        if (temperature < 5)
            return PokemonType.ICE;
        else if (temperature < 10)
            return PokemonType.WATER;
        else if (12 <= temperature && temperature < 15)
            return PokemonType.GRASS;
        else if (15 <= temperature && temperature < 21)
            return PokemonType.GROUND;
        else if (23 <= temperature && temperature < 27)
            return PokemonType.BUG;
        else if (27 <= temperature && temperature <= 33)
            return PokemonType.ROCK;
        else if (33 < temperature)
            return PokemonType.FIRE;
        else
            return PokemonType.REGULAR;
    }
}
