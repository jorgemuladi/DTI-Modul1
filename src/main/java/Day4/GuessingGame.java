package Day4;

import java.util.Random;
import java.util.Scanner;



public class GuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomInt = random.nextInt(100) + 1;

        System.out.println("Welcome to Number Guessing Game");

        int n = 0;
        do {
            System.out.println("please enter a number between 1 and 100: ");
            n = scanner.nextInt();

            if (n > randomInt) {
                System.out.println(n + " is too high! Try again.");
            } else if (n < randomInt) {
                System.out.println(n + " is too low! Try again.");
            } else {
                System.out.println("Correct!!!");
            }
        }
        while (n!=randomInt);

        scanner.close();






    }
}
