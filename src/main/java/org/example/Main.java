package org.example;
import Day5.*;
import Day7.FileReader;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1. Word Game
        /*String selectedWord = WordGame.selectRandomWord();
        String hiddenWord = WordGame.hideWord(selectedWord);
        int attempsLeft = WordGame.MaxAttempt;

        Scanner scanner = new Scanner(System.in);

        while (attempsLeft > 0 && hiddenWord.contains("_")) {
            System.out.println("Current word: " + hiddenWord);
            System.out.println("Attempts left: " + attempsLeft);

            char guess = WordGame.getPlayerGuess();

            if (WordGame.isGuessCorrect(selectedWord, guess)) {
                hiddenWord = WordGame.updateHiddenWord(selectedWord, hiddenWord, guess);
                System.out.println("Good guess!");
            } else {
                attempsLeft--;
                System.out.println("Wrong guess. Try again.");
            }

            System.out.println();
        }

        WordGame.displayGameResult(selectedWord, hiddenWord, attempsLeft);*/

        //2. Currency Conversion
//        CurrencyConversion.Convert();

        //3. Remove Odd Numbers

        // Call the method to remove odd numbers
        /*int[] evenNumbers = RemoveOddNumber.getAndProcessInput();

        // Print the result
        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));*/

        //4. Fizz Buzz
        /*Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a number to generate FizzBuzz sequence: ");
        int n = scanner.nextInt();

        // Call the method to generate and print the FizzBuzz sequence
        FizzBuzz.generateFizzBuzz(n);*/

        //5. Two Sums
        /*System.out.println("Enter the number of elements in the array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target = scanner.nextInt();

        // Call the method to find the indices of the two numbers
        int[] result = TwoSums.findTwoSum(nums, target);

        // Print the result
        if (result.length > 0) {
            System.out.println("Indices: " + Arrays.toString(result));
        }*/

        //Day 7 - File Reader

        try {
            String filePath = "E:\\Jorge's Work\\Files\\product_sales_data.csv";
            FileReader reader = new FileReader();

            Object[] data = reader.parseContent(filePath, 15);
            String[] productName = (String[]) data[0];
            int[] totalSold = (int[]) data[1];
            double[] itemPrice = (double[]) data[2];

            double totalSales = reader.calTotalSales(totalSold, itemPrice);
            System.out.println("The total sales is : " + totalSales);

            int totalProduct = reader.totalProductSold(totalSold);
            System.out.println("Total product sold is : " + totalProduct);

            String mostBoughtItem = reader.findMostBought(totalSold, productName);
            System.out.println("The most bought item is : " + mostBoughtItem);

            String leastBoughtItem = reader.findleastBoughtItem(totalSold, productName);
            System.out.println("The least bought item is : " + leastBoughtItem);


    } catch (InputMismatchException e) {
        System.out.println("Input some valid number");
    } catch (Exception e) {
        System.out.println("General exception");
    }
}
}