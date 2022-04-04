package com.oreodroid.pokemon.gateways.inbounds.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class WeatherControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getWeather_givenLocation_okResponse() throws Exception {

        // given
        String place = "Porto";

        // when
        ResultActions results = mockMvc.perform(
                get("/api/weather")
                        .param("location", place)
        );

        // then
        results.andExpect(status().isOk());
    }
}
