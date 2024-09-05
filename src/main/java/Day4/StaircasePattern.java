package Day4;

import java.util.Scanner;

public class StaircasePattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the pyramid: ");
        int n = scanner.nextInt();

        for (int i=1 ; i<=n ; i++) {
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
