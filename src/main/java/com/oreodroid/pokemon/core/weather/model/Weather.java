package com.oreodroid.pokemon.core.weather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Weather {

    private String main;

    private String description;

    private String city;

    private Float temperature;

    private Long pressure;

    private Long humidity;

    private String pokemon;

    public boolean isRaining() {

        return this.main.equals("Rains");
    }
}
