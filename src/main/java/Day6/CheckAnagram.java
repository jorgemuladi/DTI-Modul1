package Day6;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {

        String s1 = "race car";
        String t1 = "car race";
        System.out.println("Are \"" + s1 + "\" and \"" + t1 + "\" anagrams? " + areAnagrams(s1, t1));

    }

    public static boolean areAnagrams(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();


        Arrays.sort(sArray);
        Arrays.sort(tArray);


        return Arrays.equals(sArray, tArray);
    }
}
