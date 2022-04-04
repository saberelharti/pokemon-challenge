package com.oreodroid.pokemon.gateways.outbounds.service.weather.model;

import com.oreodroid.pokemon.core.weather.api.model.Weather;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OpenWeatherResponse {

    private List<WeatherResponse> weather;

    private MainResponse main;

    public Weather toDomain() {

        return new Weather(
                this.weather.get(0).getMain(),
                this.weather.get(0).getDescription(),
                this.main.getTemperature(),
                this.main.getPressure(),
                this.main.getHumidity(),
                this.main.getMinTemperature(),
                this.main.getMaxTemperature()
        );
    }
}
