package org.example;

import java.util.HashMap;
import java.util.Map;


public class CurrencyData {
     public static final Map<String, Map<String, Double>> exchangeRatesByRegion = new HashMap<>();
    //add exchange rates by region/continent
    static {

        //Africa
        Map<String, Double> africaRates = new HashMap<>();
        africaRates.put("DZD", 0.011); // the Algerian Dinar
        africaRates.put("AOA", 0.0006); // the Angolan Kwanza
        africaRates.put("BWP", 0.075); // the Botswana Pula
        africaRates.put("BIF", 0.0005); // the Burundi Franc
        africaRates.put("CVE", 0.011); // the Cape Verdean Escudo
        africaRates.put("XAF", 0.0016); // the Central African CFA Franc
        africaRates.put("CDF", 0.0006); // the Congolese Franc
        africaRates.put("DJF", 0.0055); // the Djiboutian Franc
        africaRates.put("EGP", 0.064); // the Egyptian Pound
        africaRates.put("ERN", 0.016); // the Eritrean Nakfa
        africaRates.put("SZL", 0.067); // the Swazi Lilangeni
        africaRates.put("ETB", 0.020); // the Ethiopian Birr
        africaRates.put("GMD", 0.024); // the Gambian Dalasi
        africaRates.put("GHS", 0.13); // the Ghanaian Cedi
        africaRates.put("GNF", 0.0001); // the Guinean Franc
        africaRates.put("KES", 0.13); // the Kenyan Shilling
        africaRates.put("LSL", 0.067); // the Lesotho Loti
        africaRates.put("LRD", 0.13); // the Liberian Dollar
        africaRates.put("LYD", 1.39); // the Libyan Dinar
        africaRates.put("MGA", 0.0003); // the Malagasy Ariary
        africaRates.put("MWK", 0.0013); // the Malawian Kwacha
        africaRates.put("MRU", 0.027); // the Mauritanian Ouguiya
        africaRates.put("MUR", 0.023); // the Mauritian Rupee
        africaRates.put("MAD", 0.11); // the Moroccan Dirham
        africaRates.put("MZN", 0.0003); // the Mozambican Metical
        africaRates.put("NAD", 0.067); // the Namibian Dollar
        africaRates.put("NGN", 0.0007); // the Nigerian Naira
        africaRates.put("RWF", 0.0011); // the Rwandan Franc
        africaRates.put("STD", 0.28); // the Sao Tome and Principe Dobra
        africaRates.put("SCR", 0.073); // the Seychellois Rupee
        africaRates.put("SLL", 0.011); // the Sierra Leonean Leone
        africaRates.put("SOS", 0.0002); // the Somali Shilling
        africaRates.put("ZAR", 1.0); // the South African Rand
        africaRates.put("SSP", 0.0025); // the South Sudanese Pound
        africaRates.put("SDG", 0.0033); // the Sudanese Pound
        africaRates.put("TZS", 0.0004); // the Tanzanian Shilling
        africaRates.put("TND", 0.33); // the Tunisian Dinar
        africaRates.put("UGX", 0.0007); // the Ugandan Shilling
        africaRates.put("ZMW", 0.067); // the Zambian Kwacha
        africaRates.put("ZWL", 0.0001); // the Zimbabwean Dollar

        exchangeRatesByRegion.put("Africa", africaRates);

        //Asia
        Map<String, Double> asiaRates = new HashMap<>();
        asiaRates.put("AFN", 0.011); // the Afghan Afghani
        asiaRates.put("AMD", 0.0021); // the Armenian Dram
        asiaRates.put("AZN", 0.59); // the Azerbaijani Manat
        asiaRates.put("BHD", 2.65); // the Bahraini Dinar
        asiaRates.put("BDT", 0.011); // the Bangladeshi Taka
        asiaRates.put("BND", 0.74); // the Brunei Dollar
        asiaRates.put("BTN", 0.014); // the Bhutanese Ngultrum
        asiaRates.put("KHR", 0.00025); // the Cambodian Riel
        asiaRates.put("CNY", 0.16); // the Chinese Yuan
        asiaRates.put("GEL", 0.36); // the Georgian Lari
        asiaRates.put("INR", 0.014); // the Indian Rupee
        asiaRates.put("IDR", 0.000065); // the Indonesian Rupiah
        asiaRates.put("IRR", 0.000024); // the Iranian Rial
        asiaRates.put("IQD", 0.00068); // the Iraqi Dinar
        asiaRates.put("ILS", 0.29); // the Israeli Shekel
        asiaRates.put("JPY", 0.0073); // the Japanese Yen
        asiaRates.put("JOD", 1.41); // the Jordanian Dinar
        asiaRates.put("KZT", 0.0022); // the Kazakhstani Tenge
        asiaRates.put("KWD", 3.31); // the Kuwaiti Dinar
        asiaRates.put("KGS", 0.011); // the Kyrgyzstani Som
        asiaRates.put("LAK", 0.000053); // the Lao Kip
        asiaRates.put("LBP", 0.00066); // the Lebanese Pound
        asiaRates.put("MYR", 0.24); // the Malaysian Ringgit
        asiaRates.put("MVR", 0.065); // the Maldivian Rufiyaa
        asiaRates.put("MNT", 0.00036); // the Mongolian Tugrik
        asiaRates.put("MMK", 0.00048); // the Myanmar Kyat
        asiaRates.put("NPR", 0.0085); // the Nepalese Rupee
        asiaRates.put("OMR", 2.60); // the Omani Rial
        asiaRates.put("PKR", 0.0036); // the Pakistani Rupee
        asiaRates.put("PHP", 0.018); // the Philippine Peso
        asiaRates.put("QAR", 0.27); // the Qatari Riyal
        asiaRates.put("RUB", 0.011); // the Russian Ruble
        asiaRates.put("SAR", 0.27); // the Saudi Riyal
        asiaRates.put("SGD", 0.74); // the Singapore Dollar
        asiaRates.put("KRW", 0.00083); // the South Korean Won
        asiaRates.put("LKR", 0.0028); // the Sri Lankan Rupee
        asiaRates.put("SYP", 0.00080); // the Syrian Pound
        asiaRates.put("TWD", 0.032); // the New Taiwan Dollar
        asiaRates.put("TJS", 0.087); // the Tajikistani Somoni
        asiaRates.put("THB", 0.030); // the Thai Baht
        asiaRates.put("TRY", 0.036); // the Turkish Lira
        asiaRates.put("TMT", 0.29); // the Turkmenistani Manat
        asiaRates.put("AED", 0.27); // the United Arab Emirates Dirham
        asiaRates.put("UZS", 0.000087); // the Uzbekistani Som
        asiaRates.put("VND", 0.000043); // the Vietnamese Dong
        asiaRates.put("YER", 0.0040); // the Yemeni Rial

        exchangeRatesByRegion.put("Asia", asiaRates);

        //Europe
        Map<String, Double> europeRates = new HashMap<>();
        europeRates.put("ALL", 0.0084); // the Albanian Lek
        europeRates.put("EUR", 1.1); // the Euro
        europeRates.put("AMD", 0.0021); // the Armenian Dram
        europeRates.put("AZN", 0.59); // the Azerbaijani Manat
        europeRates.put("BYN", 0.35); // the Belarusian Ruble
        europeRates.put("BAM", 0.56); // the Bosnia and Herzegovina Convertible Mark
        europeRates.put("BGN", 0.56); // the Bulgarian Lev
        europeRates.put("HRK", 0.15); // the Croatian Kuna
        europeRates.put("CZK", 0.043); // the Czech Koruna
        europeRates.put("DKK", 0.15); // the Danish Krone
        europeRates.put("GBP", 1.3); // the British Pound
        europeRates.put("GEL", 0.36); // the Georgian Lari
        europeRates.put("HUF", 0.0030); // the Hungarian Forint
        europeRates.put("ISK", 0.0074); // the Icelandic Krona
        europeRates.put("CHF", 1.09); // the Swiss Franc
        europeRates.put("NOK", 0.10); // the Norwegian Krone
        europeRates.put("PLN", 0.24); // the Polish Zloty
        europeRates.put("RON", 0.22); // the Romanian Leu
        europeRates.put("RUB", 0.011); // the Russian Ruble
        europeRates.put("RSD", 0.0094); // the Serbian Dinar
        europeRates.put("SEK", 0.096); // the Swedish Krona
        europeRates.put("TRY", 0.036); // the Turkish Lira
        europeRates.put("UAH", 0.027); // the Ukrainian Hryvnia

        exchangeRatesByRegion.put("Europe", europeRates);

        //North America
        Map<String, Double> northAmericaRates = new HashMap<>();
        northAmericaRates.put("BBD", 0.50); // the Barbadian Dollar
        northAmericaRates.put("BZD", 0.50); // the Belize Dollar
        northAmericaRates.put("CAD", 0.79); // the Canadian Dollar
        northAmericaRates.put("CRC", 0.0016); // the Costa Rican Colón
        northAmericaRates.put("CUP", 0.038); // the Cuban Peso
        northAmericaRates.put("DOP", 0.017); // the Dominican Peso
        northAmericaRates.put("SVC", 0.11); // the Salvadoran Colón
        northAmericaRates.put("GTQ", 0.13); // the Guatemalan Quetzal
        northAmericaRates.put("HTG", 0.0096); // the Haitian Gourde
        northAmericaRates.put("HNL", 0.041); // the Honduran Lempira
        northAmericaRates.put("JMD", 0.0066); // the Jamaican Dollar
        northAmericaRates.put("MXN", 0.049); // the Mexican Peso
        northAmericaRates.put("NIO", 0.027); // the Nicaraguan Córdoba
        northAmericaRates.put("PAB", 1.0); // the Panamanian Balboa
        northAmericaRates.put("TTD", 0.15); // the Trinidad and Tobago Dollar
        northAmericaRates.put("USD", 1.0); // the US Dollar

        exchangeRatesByRegion.put("North America", northAmericaRates);

        //South America
        Map<String, Double> southAmericaRates = new HashMap<>();
        southAmericaRates.put("ARS", 0.010); // the Argentine Peso
        southAmericaRates.put("BOB", 0.14); // the Bolivian Boliviano
        southAmericaRates.put("BRL", 0.19); // the Brazilian Real
        southAmericaRates.put("CLP", 0.0012); // the Chilean Peso
        southAmericaRates.put("COP", 0.00026); // the Colombian Peso
        southAmericaRates.put("GYD", 0.0048); // the Guyanese Dollar
        southAmericaRates.put("PYG", 0.00014); // the Paraguayan Guarani
        southAmericaRates.put("PEN", 0.27); // the Peruvian Sol
        southAmericaRates.put("SRD", 0.029); // the Surinamese Dollar
        southAmericaRates.put("UYU", 0.024); // the Uruguayan Peso
        southAmericaRates.put("VEF", 0.0000016); // the Venezuelan Bolivar

        exchangeRatesByRegion.put("South America", southAmericaRates);

        //Oceania
        Map<String, Double> oceaniaRates = new HashMap<>();
        oceaniaRates.put("AUD", 0.73); // the Australian Dollar
        oceaniaRates.put("FJD", 0.46); // the Fijian Dollar
        oceaniaRates.put("KID", 0.73); // the Kiribati Dollar
        oceaniaRates.put("NZD", 0.69); // the New Zealand Dollar
        oceaniaRates.put("PGK", 0.28); // the Papua New Guinean Kina
        oceaniaRates.put("SBD", 0.12); // the Solomon Islands Dollar
        oceaniaRates.put("TOP", 0.45); // the Tongan Paʻanga
        oceaniaRates.put("VUV", 0.0086); // the Vanuatu Vatu
        oceaniaRates.put("WST", 0.37); // the Samoan Tala

        exchangeRatesByRegion.put("Oceania", oceaniaRates);
        // Debug statement
        System.out.println("CurrencyData initialized with exchange rates: " + exchangeRatesByRegion);

    }
}
