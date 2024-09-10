package Day6;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(Arrays.toString(nums1));
        System.out.println("Duplicates: " + findDuplicates(nums1));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        // Create sets for tracking seen elements and duplicates
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }

        return new ArrayList<>(duplicates);
    }
}
