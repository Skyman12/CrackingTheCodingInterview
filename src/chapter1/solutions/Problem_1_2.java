package chapter1.solutions;


import java.util.Arrays;
import java.util.HashMap;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 *
 * Created by bskaja on 7/16/16.
 */
public class Problem_1_2 {

    /**
     * Sort the two strings, compare at each index.
     *
     * Runtime: O(n * log(n))
     * Space complexity: O(n)
     *
     * @return true if the two strings are permutations
     */
    public boolean solution1(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0; i < s1.length(); i++) {
            if (array1[i] != array2[i]) return false;
        }

        return true;
    }

    /**
     * Best solution
     *
     * Use HashMap to record the number of each character in the first string. Then iterate through the second string
     * and subtract from the count if a char exists.
     *
     * Runtime: O(n)
     * Space complexity: O(n)
     *
     * @return true if the two strings are permutations
     */
    public boolean solution2(String s1, String s2) {
        HashMap<Character, Integer> string1 = new HashMap<>();

        for (Character c : s1.toCharArray()) {
            if (string1.containsKey(c)) {
                string1.put(c, string1.get(c) + 1);
            } else {
                string1.put(c, 1);
            }
        }

        for (Character c : s2.toCharArray()) {
            if (!string1.containsKey(c)) {
                return false;
            } else {
                if (string1.get(c) == 0) return false;
                else string1.put(c, string1.get(c) - 1);
            }
        }

        return true;
    }
}
