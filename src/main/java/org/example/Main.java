package org.example;
import Day5.*;

import java.util.Arrays;
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



    }
}