package com.oreodroid.pokemon.core.weather.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Weather {

    private String main;

    private String description;

    private Float temperature;

    private Long pressure;

    private Long humidity;

    private Float minTemperature;

    private Float maxTemperature;
}
