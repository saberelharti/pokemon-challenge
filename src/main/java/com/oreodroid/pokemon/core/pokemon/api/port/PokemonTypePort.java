package com.oreodroid.pokemon.core.pokemon.api.port;

import com.oreodroid.pokemon.core.pokemon.api.model.Pokemon;

public interface PokemonTypePort {

    Pokemon getRandomPokemonNameByType(String type);
}
