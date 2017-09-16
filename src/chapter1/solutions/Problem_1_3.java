
package chapter1.solutions;


import java.util.Arrays;
import java.util.HashMap;

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space
 * at the end to hold the additional character, and that you are given the "true" length of the string.
 *
 * Perform this operation in place.
 *
 * Created by bskaja on 7/16/16.
 */
public class Problem_1_3 {

    /**
     * Sort the two strings, compare at each index.
     *
     * Runtime: O(n * log(n))
     * Space complexity: O(n)
     *
     * @return true if the two strings are permutations
     */
    public String solution1(String s) {
        return s.replaceAll(" ", "%20");
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
