package Day6;

import java.util.Arrays;

public class CheckDuplicateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(Arrays.toString(nums));

        boolean isDuplicate = containsDuplicate(nums);

        // Print the result
        System.out.println(isDuplicate);
    }

    // Method to check if the array contains duplicates
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Duplicate found
                }
            }
        }
        return false;
    }
}
