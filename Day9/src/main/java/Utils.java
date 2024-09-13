
import java.util.Scanner;

public class Utils {
    static int scanInt(Scanner scanner, String text) {
        System.out.print(text);
        scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input is not integer.");
            return scanInt(scanner, text);
        }
    }

    static String scanText(Scanner scanner, String text) {
        System.out.print(text);
        scanner = new Scanner(System.in);
        try {
            return scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Input error : " + e.getMessage());
            return scanText(scanner, text);
        }
    }

    public static void closeScanner(Scanner scanner) {
        try {
            scanner.close();
        } catch (IllegalStateException e) {
            System.out.println("Scanner is already closed.");
        }
    }
}