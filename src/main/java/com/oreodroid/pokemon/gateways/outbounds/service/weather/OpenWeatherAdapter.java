package com.oreodroid.pokemon.gateways.outbounds.service.weather;

import com.oreodroid.pokemon.commons.config.OpenWeatherApiConfig;
import com.oreodroid.pokemon.core.weather.api.port.OpenWeatherPort;
import com.oreodroid.pokemon.gateways.outbounds.service.weather.model.OpenWeatherResponse;
import lombok.AllArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class OpenWeatherAdapter implements OpenWeatherPort {

    private final RestTemplate restTemplate;
    private final OpenWeatherApiConfig openWeatherApiConfig;

    @Override
    public OpenWeatherResponse getWeatherByLocation(String location) {

        val detectPlateUrl = String.format("%s?q=%s&appid=%s", openWeatherApiConfig.getUrl(), location, openWeatherApiConfig.getAppid());
        return restTemplate.getForObject(detectPlateUrl, OpenWeatherResponse.class);
    }
}