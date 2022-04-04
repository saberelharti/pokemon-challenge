package com.oreodroid.pokemon.gateways.outbounds.service.weather;

import com.oreodroid.pokemon.core.weather.api.port.OpenWeatherPort;
import com.oreodroid.pokemon.gateways.outbounds.service.weather.model.OpenWeatherResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class OpenWeatherAdapter implements OpenWeatherPort {

    private final RestTemplate restTemplate;

    @Override
    public OpenWeatherResponse getWeatherByLocation(String location) {

        String detectPlateUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=0fdc3394d1eec47b6bcdbe184cd42b93";
        return restTemplate.getForObject(detectPlateUrl, OpenWeatherResponse.class);
    }
}
