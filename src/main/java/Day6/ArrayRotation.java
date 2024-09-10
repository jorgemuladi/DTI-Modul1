package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of element: ");
        int n = scanner.nextInt();
        int[] inputNumber = new int[n];


        System.out.println("Enter the elements: ");
        for (int i=0 ; i<inputNumber.length ; i++) {
            inputNumber[i] = scanner.nextInt();
        }
        System.out.println("Array content: " + Arrays.toString(inputNumber));

        System.out.println("Index starting rotation: ");
        int d = scanner.nextInt();

        // Perform the rotation
        int[] rotatedArray = rotateArray(inputNumber, d);

        // Print the rotated array
        System.out.println("Rotated array: " + Arrays.toString(rotatedArray));

    }

    public static int[] rotateArray(int[] array, int d) {
        int n = array.length;

        // Normalize d to avoid unnecessary rotations
        d = d % n;

        // Create a new array for the result
        int[] rotated = new int[n];

        // Copy the elements to the new array
        for (int i = 0; i < n; i++) {
            int newPosition = (i - d + n) % n;
            rotated[newPosition] = array[i];
        }

        return rotated;
        }
}
