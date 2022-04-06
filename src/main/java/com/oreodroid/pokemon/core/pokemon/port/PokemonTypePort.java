package com.oreodroid.pokemon.core.pokemon.port;

import com.oreodroid.pokemon.core.pokemon.model.Pokemon;

public interface PokemonTypePort {

    Pokemon getRandomPokemonNameByType(String type);
}
