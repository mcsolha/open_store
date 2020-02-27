package com.open.store.open_store.core.utils;

/**
 * Contains static methods used for number rounding
 * @author Matheus Solha
 */
public class Rounding {
    /**
     * Round a double value up to the nearest 0.05
     * @param value Value to be rounded
     * @return Rounded double
     */
    public static double roundToTheNearestPointZeroFive(double value) {
        return Math.round(value * 20) / 20.0;
    }
}