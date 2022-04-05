package com.oreodroid.pokemon.core.pokemon.api.actions;

import com.oreodroid.pokemon.core.pokemon.api.port.PokemonTypePort;
import com.oreodroid.pokemon.core.pokemon.usecase.GetPokemonNameByType;
import lombok.AllArgsConstructor;

import javax.inject.Named;

@Named
@AllArgsConstructor
public class GetPokemonNameByTypeImpl implements GetPokemonNameByType {

    private final PokemonTypePort pokemonTypePort;

    @Override
    public String handle(String type) {
        return pokemonTypePort.getRandomPokemonNameByType(type).getName();
    }
}
