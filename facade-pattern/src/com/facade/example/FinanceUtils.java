package com.facade.example;

public class FinanceUtils {
    public static double calculateVAT(double price) {
        // Assuming a fixed VAT rate of 20%
        double vatRate = 0.20;
        return price * vatRate;
    }
}
