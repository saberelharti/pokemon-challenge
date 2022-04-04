package com.oreodroid.pokemon.core.weather.api.port;

import com.oreodroid.pokemon.gateways.outbounds.service.weather.model.OpenWeatherResponse;

public interface OpenWeatherPort {

    OpenWeatherResponse getWeatherByLocation(String location);
}
