package com.facade.example;

public class BankUtils {
    public static double convertFromShekelsToDollar(double shekels) {
        // Assuming an exchange rate of 0.28 dollars per shekel
        double exchangeRate = 0.28;
        return shekels * exchangeRate;
    }
}
