package com.oreodroid.pokemon.gateways.outbounds.service.pokemon.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PokemonSlotResponse {

    private PokemonResponse pokemon;

    private int slot;
}
