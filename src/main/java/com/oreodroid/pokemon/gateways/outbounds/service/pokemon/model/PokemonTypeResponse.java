package com.oreodroid.pokemon.gateways.outbounds.service.pokemon.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PokemonTypeResponse {

    private List<PokemonResponse> pokemon;
}
