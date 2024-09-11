package Day7;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (press 'q' to finish): ");

        double sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                sum += number;
                count++;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
            }
        }

        if (count > 0) {
            double average = sum / count ;
            System.out.println("average: " + average);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}
