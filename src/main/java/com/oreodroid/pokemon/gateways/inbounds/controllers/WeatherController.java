package com.oreodroid.pokemon.gateways.inbounds.controllers;

import com.oreodroid.pokemon.core.weather.model.Weather;
import com.oreodroid.pokemon.core.weather.usecases.GetWeatherByLocation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api", produces = "application/json")
public class WeatherController {

    private final GetWeatherByLocation getWeatherByLocation;

    @GetMapping(path = "/weather")
    public Weather getWeather(@RequestParam("city") String city) {
        return getWeatherByLocation.handle(city);
    }
}
