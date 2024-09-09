package Day5;

public class FizzBuzz {

    public static void generateFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz, ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz, ");
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
}