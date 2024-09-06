package Day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true) {
            System.out.print("Do you want to input a number? (press 'y' to continue / press 'n' to stop): ");
            String response = scanner.next();

            if (response.equalsIgnoreCase("n")) {
                break;
            }
            if (response.equalsIgnoreCase("y")) {
                System.out.print("Input a number: ");
                String input = scanner.next();

                int number = 0;
                try {
                    number = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number: " + input);
                    continue;
                }

                list.add(number);
            } else {
                System.out.println("Invalid response. Please enter 'y' or 'n'.");
            }
        }

        System.out.println("Inputted " + list.size() + " random numbers.");
        System.out.println("Inputted " + list.toString());

        scanner.close();
    }
}
