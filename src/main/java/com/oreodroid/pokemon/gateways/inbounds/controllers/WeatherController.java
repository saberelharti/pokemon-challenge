package com.oreodroid.pokemon.gateways.inbounds.controllers;

import com.oreodroid.pokemon.core.weather.api.model.Weather;
import com.oreodroid.pokemon.core.weather.usecase.GetWeatherByLocation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api", produces = "application/json")
public class WeatherController {

    private final GetWeatherByLocation getWeatherByLocation;

    @GetMapping(path = "/weather")
    public Weather getWeather(@RequestParam("location") String location) {
        return getWeatherByLocation.handle(location);
    }
}
