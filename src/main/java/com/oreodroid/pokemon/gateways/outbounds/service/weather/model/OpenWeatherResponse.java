package com.oreodroid.pokemon.gateways.outbounds.service.weather.model;

import com.oreodroid.pokemon.commons.TemperatureUtils;
import com.oreodroid.pokemon.core.weather.model.Weather;
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

    public Weather toDomain(String city) {

        WeatherResponse weatherResponse = new WeatherResponse();
        if (this.weather != null && !this.weather.isEmpty())
            weatherResponse = this.weather.get(0);

        return new Weather(
                weatherResponse.getMain(),
                weatherResponse.getDescription(),
                city,
                TemperatureUtils.fahrenheitToCelsius(main.getTemperature()),
                main.getPressure(),
                main.getHumidity(),
                null
        );
    }
}
