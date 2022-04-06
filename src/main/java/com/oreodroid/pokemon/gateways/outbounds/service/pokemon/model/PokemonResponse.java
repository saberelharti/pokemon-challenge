package com.oreodroid.pokemon.gateways.outbounds.service.pokemon.model;

import com.oreodroid.pokemon.core.pokemon.model.Pokemon;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PokemonResponse {

    private String name;

    private String url;

    public Pokemon toDomain() {

        return new Pokemon(
                this.name,
                this.url);
    }
}
