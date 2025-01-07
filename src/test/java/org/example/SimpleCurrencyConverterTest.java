package org.example;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

    public class SimpleCurrencyConverterTest {

        private SimpleCurrencyConverter converter;
        private Map<String, Double> exchangeRates;

        @Before
        public void setUp() {
            converter = new SimpleCurrencyConverter();
            exchangeRates = new HashMap<>();
            exchangeRates.put("USD", 1.0);
            exchangeRates.put("EUR", 0.85);
            exchangeRates.put("JPY", 110.0);
        }

        @Test
        public void testConvert_ValidCurrencies() {
            double result = converter.convert("USD", "EUR", 100, exchangeRates);
            assertEquals(85.0, result, 0.001);
        }

        //test valid currencies
        @Test
        public void testConvert_InvalidSourceCurrency() {
            assertThrows(IllegalArgumentException.class, () -> {
                converter.convert("INVALID", "EUR", 100, exchangeRates);
            });
        }

        //test invalid currencies
        @Test
        public void testConvert_InvalidTargetCurrency() {
            assertThrows(IllegalArgumentException.class, () -> {
                converter.convert("USD", "INVALID", 100, exchangeRates);
            });
        }

        //test same currencies
        @Test
        public void testConvert_SameCurrency() {
            double result = converter.convert("USD", "USD", 100, exchangeRates);
            assertEquals(100.0, result, 0.001);
        }

        //test results with large amounts
        @Test
        public void testConvert_LargeAmount() {
            double result = converter.convert("USD", "JPY", 1000, exchangeRates);
            assertEquals(110000.0, result, 0.001);
        }
    }

