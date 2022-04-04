package com.oreodroid.pokemon.core.weather.usecase;

import com.oreodroid.pokemon.core.weather.api.model.Weather;

public interface GetWeatherByLocation {

    Weather handle(String location);
}
