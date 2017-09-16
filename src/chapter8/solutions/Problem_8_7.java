package chapter8.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Permutations without Dups:
 *
 * Write a method to compute all permutations of a string of unique characters.
 *
 * Created by bskaja on 9/19/16.
 */
public class Problem_8_7 {

    public List<String> solution1 (String arr) {
        List<String> solution = new LinkedList<>();
        solution.add(arr.charAt(0) + "");

        int index = 1;

        while (index < arr.length()) {
            solution = helper(solution, arr.charAt(index) + "");
            index++;
        }

        return solution;
    }

    private List<String> helper(List<String> arr, String toAppend) {
        List<String> newList = new LinkedList<>();
        for (String s : arr) {
            if (s.length() == 1) {
                newList.add(s + toAppend);
                newList.add(toAppend + s);
            } else {
                newList.add(toAppend + s);
                for (int i = 1; i < s.length() + 1; i++) {
                    newList.add(s.substring(0, i) + toAppend + s.substring(i, s.length()));
                }
            }

        }

        return newList;
    }

}
