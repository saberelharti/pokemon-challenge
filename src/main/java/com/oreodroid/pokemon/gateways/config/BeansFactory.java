package com.oreodroid.pokemon.gateways.config;

import com.oreodroid.pokemon.commons.config.OpenWeatherApiConfig;
import com.oreodroid.pokemon.commons.config.PokemonApiConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeansFactory {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    @ConfigurationProperties(prefix = "app.open-weather-api")
    public OpenWeatherApiConfig createOpenWeatherApiConfig() {
        return new OpenWeatherApiConfig();
    }

    @Bean
    @ConfigurationProperties(prefix = "app.pokemon-api")
    public PokemonApiConfig createPokemonApiConfig() {
        return new PokemonApiConfig();
    }
}
