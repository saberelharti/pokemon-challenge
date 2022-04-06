package com.oreodroid.pokemon.commons;

public abstract class TemperatureUtils {

    public static float fahrenheitToCelsius(float fahrenheit) {

        return ((fahrenheit - 32) * 5) / 9;
    }
}
