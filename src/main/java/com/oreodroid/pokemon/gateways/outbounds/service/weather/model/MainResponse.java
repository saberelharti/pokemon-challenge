package com.oreodroid.pokemon.gateways.outbounds.service.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MainResponse {

    @JsonProperty("temp")
    private Float temperature;

    private Long pressure;

    private Long humidity;

    @JsonProperty("temp_min")
    private Float minTemperature;

    @JsonProperty("temp_max")
    private Float maxTemperature;
}
