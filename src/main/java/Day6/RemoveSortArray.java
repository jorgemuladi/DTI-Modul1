package Day6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RemoveSortArray {

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3,4,5};
        System.out.println("Input array: " + Arrays.toString(nums));

        int[] newArray = removeDuplicates(nums);

        // Print the array with duplicates removed
        System.out.println("Output array: " + Arrays.toString(newArray));
        System.out.println();


        //Array Sorting
        int[] input = {8, 7, 5, 2};
        System.out.println("Original Array: " + Arrays.toString(input));

        // Get sorting direction from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sorting direction (asc or desc): ");
        String direction = scanner.next();

        // Sort the array based on the user-defined direction
        sortArray(input, direction);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(input));
    }
    public static int[] removeDuplicates(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Temporary array to store unique elements
        int[] temp = new int[nums.length];
        int j = 0;

        // Traverse the sorted array
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                temp[j++] = nums[i];
            }
        }

        // Create a new array with the exact size of unique elements
        return Arrays.copyOf(temp, j);
    }
    public static void sortArray(int[] nums, String direction) {
        if (direction.equalsIgnoreCase("asc")) {
            Arrays.sort(nums); // Sorts in ascending order
        } else if (direction.equalsIgnoreCase("desc")) {
            // Sorts in descending order
            Integer[] numsObject = Arrays.stream(nums).boxed().toArray(Integer[]::new);
            Arrays.sort(numsObject, Comparator.reverseOrder());
            for (int i = 0; i < nums.length; i++) {
                nums[i] = numsObject[i];
            }
        } else {
            System.out.println("Invalid direction. Please use 'asc' or 'desc'.");
        }
    }
}
