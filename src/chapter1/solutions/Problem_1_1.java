package chapter1.solutions;

import java.util.HashSet;

import static java.util.Arrays.sort;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 *
 * Created by bskaja on 7/16/16.
 */
public class Problem_1_1 {

    /**
     * Bad solution
     *
     * Runtime: O(n^2)
     * Space complexity: O(n)
     *
     * @param s
     * @return true if all characters are unique
     */
    public boolean solution1(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }

        return true;
    }

    /**
     * Medium solution
     *
     * Sort the array. Compare the items next to each other to see if all are unique.
     *
     * Runtime: O(n * log(n))
     * Space complexity: O(n)
     *
     * @param s
     * @return true if all characters are unique
     */
    public boolean solution2(String s) {
        char[] array = s.toCharArray();
        sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) return false;
        }

        return true;
    }

    /**
     * Best solution
     *
     * Using additional data structure - HashSet
     *
     * Runtime: O(n)
     * Space complexity: O(n)
     *
     * @param s
     * @return true if all characters are unique
     */
    public boolean solution3(String s) {
        HashSet<Character> characterSet = new HashSet<>();

        for (Character c : s.toCharArray()) {
            if (characterSet.contains(c)) return false;

            characterSet.add(c);
        }

        return true;
    }
}
