import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        // Exchange rates as of 28th April, 2023
        double usdToInr = 75.53;
        double usdToEur = 0.85;
        double inrToUsd = 0.013;
        double inrToEur = 0.012;
        double eurToUsd = 1.17;
        double eurToInr = 83.02;

        // User input
        System.out.println("Enter the currency you want to convert from (USD, INR, EUR): ");
        String fromCurrency = input.nextLine().toUpperCase();
        System.out.println("Enter the currency you want to convert to (USD, INR, EUR): ");
        String toCurrency = input.nextLine().toUpperCase();
        System.out.println("Enter the amount to convert: ");
        double amount = input.nextDouble();

        // Currency conversion
        double convertedAmount = 0.0;

        if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
            convertedAmount = amount * usdToInr;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            convertedAmount = amount * usdToEur;
        } else if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
            convertedAmount = amount * inrToUsd;
        } else if (fromCurrency.equals("INR") && toCurrency.equals("EUR")) {
            convertedAmount = amount * inrToEur;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            convertedAmount = amount * eurToUsd;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("INR")) {
            convertedAmount = amount * eurToInr;
        } else {
            System.out.println("Invalid input. Please try again.");
            System.exit(0);
        }

        // Output result
        System.out.println(df.format(amount) + " " + fromCurrency + " = " + df.format(convertedAmount) + " " + toCurrency);
    }
}
