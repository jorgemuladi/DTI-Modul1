package Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveOddNumber {
    public static int[] deleteOddNumbers(int[] numbers) {
        List<Integer> evenNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        // Convert List<Integer> to int[]
        int[] result = new int[evenNumbers.size()];
        for (int i = 0; i < evenNumbers.size(); i++) {
            result[i] = evenNumbers.get(i);
        }

        return result;
    }
    public static int[] getAndProcessInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        // Split the input string into an array of strings
        String[] inputStrings = input.split(" ");

        // Convert the array of strings to an array of integers
        int[] numbers = new int[inputStrings.length];
        for (int i = 0; i < inputStrings.length; i++) {
            numbers[i] = Integer.parseInt(inputStrings[i]);
        }

        // Remove odd numbers and return the result
        return deleteOddNumbers(numbers);
    }
}
