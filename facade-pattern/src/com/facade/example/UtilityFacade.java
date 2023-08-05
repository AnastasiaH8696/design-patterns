package com.facade.example;

public class UtilityFacade {
    // MathUtils methods
    public static double add(double num1, double num2) {
        return MathUtils.total(num1, num2);
    }

    public static double multiply(double num1, double num2) {
        return MathUtils.multiply(num1, num2);
    }

    // FinanceUtils method
    public static double calculateVAT(double price) {
        return FinanceUtils.calculateVAT(price);
    }

    // BankUtils method
    public static double convertFromShekelsToDollar(double shekels) {
        return BankUtils.convertFromShekelsToDollar(shekels);
    }
}
