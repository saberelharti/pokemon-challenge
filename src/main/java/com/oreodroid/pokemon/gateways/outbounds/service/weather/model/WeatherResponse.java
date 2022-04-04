package com.oreodroid.pokemon.gateways.outbounds.service.weather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherResponse {

    private int id;

    private String main;

    private String description;

    private String icon;
}
