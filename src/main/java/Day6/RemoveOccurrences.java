package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements separated by space: ");
        String input = scanner.nextLine();

        List<Integer> list = new ArrayList<>();
        try {
            for (String str : input.split("\\s+")) {
                list.add(Integer.parseInt(str));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter only integers.");
            return;
        }

        // Print the original list
        System.out.println("Original List: " + list);

        // Input for the element to remove
        System.out.print("Enter the element to remove: ");
        int key = scanner.nextInt();

        // Remove all occurrences of the key
        list.removeAll(Arrays.asList(key));

        // Print the result
        System.out.println("List after removing all occurrences of " + key + ": " + list);

    }
}
