package com.oreodroid.pokemon.commons.config;

abstract class TemperatureUtils {

    public float fahrenheitToCelsius(float fahrenheit) {

        return ((fahrenheit - 32) * 5) / 9;
    }
}
