package com.oreodroid.pokemon.core.weather.port;

import com.oreodroid.pokemon.core.weather.model.Weather;

public interface OpenWeatherPort {

    Weather getWeatherByLocation(String city);
}
