package Day6;

import java.util.Stack;
import java.util.Arrays;

public class DaysToWarmTemp {
    public static void main(String[] args) {
        // Test cases
        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(temperatures1));
        System.out.println("Days to wait for warmer temperature: " + Arrays.toString(daysToWarmTemp(temperatures1)));
    }

    public static int[] daysToWarmTemp(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }

        // No need to handle the remaining indices in the stack because they will be 0 in the result array by default.
        return result;
    }
}
