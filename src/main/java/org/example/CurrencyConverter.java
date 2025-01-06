package org.example;

import java.util.Map;

public interface CurrencyConverter {
    double convert(String sourceCurrency, String targetCurrency, double amount, Map<String, Double> exchangeRates);
}

