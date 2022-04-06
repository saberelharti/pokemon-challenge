package com.oreodroid.pokemon.core.weather.usecases;

import com.oreodroid.pokemon.core.weather.model.Weather;

public interface GetWeatherByLocation {

    Weather handle(String location);
}
