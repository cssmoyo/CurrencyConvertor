package org.example;

import java.util.Map;

public interface CurrencyConverter {
    //convert parameters
    double convert(String sourceCurrency, String targetCurrency, double amount, Map<String, Double> exchangeRates);
}

