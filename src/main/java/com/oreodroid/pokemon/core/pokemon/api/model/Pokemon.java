package com.oreodroid.pokemon.core.pokemon.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pokemon {

    private String name;

    private String url;

    private int slot;
}
