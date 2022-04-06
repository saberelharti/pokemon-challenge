package com.oreodroid.pokemon.gateways.outbounds.service.weather;

import com.oreodroid.pokemon.commons.config.OpenWeatherApiConfig;
import com.oreodroid.pokemon.core.weather.model.Weather;
import com.oreodroid.pokemon.core.weather.port.OpenWeatherPort;
import com.oreodroid.pokemon.gateways.outbounds.service.weather.model.OpenWeatherResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class OpenWeatherAdapter implements OpenWeatherPort {

    private final RestTemplate restTemplate;
    private final OpenWeatherApiConfig openWeatherApiConfig;

    @Override
    public Weather getWeatherByLocation(String city) throws HttpClientErrorException {

        String weatherApi = String.format("%s/weather?q=%s&appid=%s", openWeatherApiConfig.getUrl(), city, openWeatherApiConfig.getAppid());

        OpenWeatherResponse openWeatherResponse = restTemplate.getForObject(weatherApi, OpenWeatherResponse.class);
        if (openWeatherResponse != null)
            return openWeatherResponse.toDomain(city);
        else
            return null;
    }
}
