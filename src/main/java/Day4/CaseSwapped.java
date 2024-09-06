package Day4;

import java.util.Scanner;

public class CaseSwapped {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder swap = new StringBuilder();

        System.out.println("Enter strings to be case swapped: ");
        String input = scanner.nextLine();

        for (int i=0 ; i<input.length() ; i++) {
            if (Character.isLowerCase(input.charAt(i))) {
                swap.append(Character.toUpperCase(input.charAt(i)));
            } else {
                swap.append(Character.toLowerCase(input.charAt(i)));
            }
        }
            System.out.println("Result: " + swap);
    }
}
