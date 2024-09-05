package Day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        // At least once
        do {
            System.out.print("Input a random number or (press 'y' to continue / press 'n' to stop): ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("n")) {
                break;
            }
            if (input.equalsIgnoreCase("y")) {
                continue;
            }
                int number = 0;

                try {
                    number = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number: " + input);
                    continue;
                }
                list.add(number);


            }
            while (list.size() < 3) ;

            System.out.println("Inputted " + list.size() + " random numbers");
            System.out.println("Inputted " + list.toString());

    }
}
