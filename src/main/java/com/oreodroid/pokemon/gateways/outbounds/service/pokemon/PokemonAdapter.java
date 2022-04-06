package com.oreodroid.pokemon.gateways.outbounds.service.pokemon;

import com.oreodroid.pokemon.commons.config.PokemonApiConfig;
import com.oreodroid.pokemon.core.pokemon.model.Pokemon;
import com.oreodroid.pokemon.core.pokemon.port.PokemonTypePort;
import com.oreodroid.pokemon.gateways.outbounds.service.pokemon.model.PokemonTypeResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
@AllArgsConstructor
public class PokemonAdapter implements PokemonTypePort {

    private final RestTemplate restTemplate;
    private final PokemonApiConfig pokemonApiConfig;

    @Override
    public Pokemon getRandomPokemonNameByType(String type) throws HttpClientErrorException {

        Random rand = new Random();
        String getPokemonTypeApi = String.format("%s/type/%s", pokemonApiConfig.getUrl(), type);
        PokemonTypeResponse pokemonTypeResponse = restTemplate.getForObject(getPokemonTypeApi, PokemonTypeResponse.class);
        if (pokemonTypeResponse != null)
            return pokemonTypeResponse.getPokemon().get(rand.nextInt(pokemonTypeResponse.getPokemon().size())).getPokemon().toDomain();
        else
            return null;
    }
}
