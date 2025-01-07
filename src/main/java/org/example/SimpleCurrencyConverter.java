package org.example;
import java.util.Map;

public class SimpleCurrencyConverter implements CurrencyConverter {
    @Override
    public double convert(String sourceCurrency, String targetCurrency, double amount, Map<String, Double> exchangeRates) {
        // does exchange rates contain the source and target currency?
        if (!exchangeRates.containsKey(sourceCurrency) || !exchangeRates.containsKey(targetCurrency)) {
            throw new IllegalArgumentException("Invalid currency code");
        }

        // get exchange rates for the source and target currency
        double sourceRate = exchangeRates.get(sourceCurrency);
        double targetRate = exchangeRates.get(targetCurrency);

        // amount = source currency / target currency
        return amount * (targetRate / sourceRate);

    }
}

