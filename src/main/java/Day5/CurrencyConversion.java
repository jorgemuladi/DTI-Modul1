package Day5;

import java.util.Scanner;

public class CurrencyConversion {

    private static final double USD_TO_EUR = 0.92;
    private static final double EUR_TO_USD = 0.64;
    private static final double USD_TO_GBP = 0.79;
    private static final double USD_TO_JPY = 147.65;

    public static void Convert(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount to convert: ");
        double inputAmount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the source currency (USD, EUR, GBP, or JPY): ");
        String sourceCurrency = scanner.nextLine().toUpperCase();


        System.out.println("Enter the target currency (USD, EUR, GBP, or JPY): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        double convertedAmount = convertCurrency(inputAmount, sourceCurrency, targetCurrency);
        System.out.printf("%.2f %s is equal to %.2f %s%n", inputAmount, sourceCurrency, convertedAmount, targetCurrency);

    }

    private static double convertCurrency(double amount, String source, String target) {
        // Conversion logic
        double amountInUSD = amount;

        // Convert to USD if necessary
        if (source.equals("EUR")) {
            amountInUSD = amount / EUR_TO_USD;
        } else if (source.equals("GBP")) {
            amountInUSD = amount / USD_TO_GBP;
        } else if (source.equals("JPY")) {
            amountInUSD = amount / USD_TO_JPY;
        }

        // Convert from USD to target currency
        if (target.equals("EUR")) {
            return amountInUSD * USD_TO_EUR;
        } else if (target.equals("GBP")) {
            return amountInUSD * USD_TO_GBP;
        } else if (target.equals("JPY")) {
            return amountInUSD * USD_TO_JPY;
        } else {
            return amountInUSD; // Default to USD
        }
    }
}
