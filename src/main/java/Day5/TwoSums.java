package Day5;

import java.util.HashMap;

public class TwoSums {
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        // If no pair is found
        System.out.println("No pair exist");
        return new int[]{};
    }
}
