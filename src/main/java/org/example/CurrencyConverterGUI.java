package org.example;
import javax.swing.*;
import java.util.Map;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class CurrencyConverterGUI extends JFrame {

    private JComboBox<String> regionBox;
    private JComboBox<String> sourceCurrencyBox;
    private JComboBox<String> targetCurrencyBox;
    private JTextField amountField;
    private JLabel resultLabel;
    private CurrencyConverter currencyConverter = new SimpleCurrencyConverter();

    public CurrencyConverterGUI() {
        setTitle("Currency Converter");
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        //Components
        regionBox = new JComboBox<>(CurrencyData.exchangeRatesByRegion.keySet().toArray(new String[0]));
        sourceCurrencyBox = new JComboBox<>();
        targetCurrencyBox = new JComboBox<>();
        amountField = new JTextField();
        JButton convertButton = new JButton("Convert");
        resultLabel = new JLabel("Converted amount: ");

        //components to frame
        add(new JLabel("Region: "));
        add(regionBox);
        add(new JLabel("Source Currency: "));
        add(sourceCurrencyBox);
        add(new JLabel("Target Currency: "));
        add(targetCurrencyBox);
        add(new JLabel("Amount: "));
        add(amountField);
        add(new JLabel("Convert"));
        add(convertButton);
        add(new JLabel("Result"));
        add(resultLabel);

        // Debug statement to show all regions
        System.out.println("Available regions: " + CurrencyData.exchangeRatesByRegion.keySet());

        //actionListener for region selected
        regionBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedRegion = (String) regionBox.getSelectedItem();
                System.out.println("Selected region: " + selectedRegion); // Debug statement
                updateCurrencyBoxes(selectedRegion);
            }
        });

        //actionListener for convert button

        convertButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                String sourceCurrency = (String) sourceCurrencyBox.getSelectedItem();
                String targetCurrency = (String) targetCurrencyBox.getSelectedItem();
                double amount = Double.parseDouble(amountField.getText());
                String selectedRegion = (String) regionBox.getSelectedItem();
                Map<String, Double> exchangeRates = CurrencyData.exchangeRatesByRegion.get(selectedRegion);
                try {
                    double convertedAmount = currencyConverter.convert(sourceCurrency, targetCurrency, amount, exchangeRates);
                    resultLabel.setText("Converted amount: " + convertedAmount + " " + targetCurrency);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(CurrencyConverterGUI.this, ex.getMessage());
                }

            }
        });

        // Set default region and update currency boxes to avoid NullPointerExecption
        String defaultRegion = "North America";
        regionBox.setSelectedItem(defaultRegion);
        System.out.println("Default region set to: " + defaultRegion);//debug
        updateCurrencyBoxes(defaultRegion);
    }

    private void updateCurrencyBoxes(String region) {
        sourceCurrencyBox.removeAllItems();
        targetCurrencyBox.removeAllItems();
        Map<String, Double> exchangeRates = CurrencyData.exchangeRatesByRegion.get(region);
        if (exchangeRates != null) {
            for (String currency : exchangeRates.keySet()) {
                sourceCurrencyBox.addItem(currency);
                targetCurrencyBox.addItem(currency);
                System.out.println("Added currency to combo boxes: " + currency); // Debug statement
            }
        } else {
            System.err.println("Exchange rates not found for region: " + region);
        }
    }


}
