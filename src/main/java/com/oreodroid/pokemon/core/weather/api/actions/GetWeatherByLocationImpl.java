package com.oreodroid.pokemon.core.weather.api.actions;

import com.oreodroid.pokemon.core.weather.api.model.Weather;
import com.oreodroid.pokemon.core.weather.api.port.OpenWeatherPort;
import com.oreodroid.pokemon.core.weather.usecase.GetWeatherByLocation;
import lombok.AllArgsConstructor;

import javax.inject.Named;

@Named
@AllArgsConstructor
public class GetWeatherByLocationImpl implements GetWeatherByLocation {

    private final OpenWeatherPort openWeatherPort;

    @Override
    public Weather handle(String location) {
        return openWeatherPort.getWeatherByLocation(location).toDomain();
    }
}
