package Day4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for the multiplication table: ");
        int n = scanner.nextInt();

        for (int i=1 ; i<=n ; i++) {
            for (int j=1 ; j<=n ; j++) {
                System.out.print(i * j+ " " );
            }
            System.out.println();
        }
    }
}