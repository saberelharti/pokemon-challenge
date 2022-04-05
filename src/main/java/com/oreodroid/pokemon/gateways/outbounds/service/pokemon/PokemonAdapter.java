package com.oreodroid.pokemon.gateways.outbounds.service.pokemon;

import com.oreodroid.pokemon.commons.config.PokemonApiConfig;
import com.oreodroid.pokemon.core.pokemon.api.model.Pokemon;
import com.oreodroid.pokemon.core.pokemon.api.port.PokemonTypePort;
import com.oreodroid.pokemon.gateways.outbounds.service.pokemon.model.PokemonTypeResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Component
@AllArgsConstructor
public class PokemonAdapter implements PokemonTypePort {

    private final RestTemplate restTemplate;
    private final PokemonApiConfig pokemonApiConfig;

    @Override
    public Pokemon getRandomPokemonNameByType(String type) {

        Random rand = new Random();
        String getPokemonTypeApi = String.format("%s/type/%s", pokemonApiConfig.getUrl(), type);
        PokemonTypeResponse pokemonTypeResponse = restTemplate.getForObject(getPokemonTypeApi, PokemonTypeResponse.class);
        return pokemonTypeResponse.getPokemon().get(rand.nextInt(pokemonTypeResponse.getPokemon().size())).toDomain();
    }
}
