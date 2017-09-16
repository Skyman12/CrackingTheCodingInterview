package arrays.tests;

import arrays.solutions.Problem1_IdenticalIntegerArrays;
import chapter8.solutions.Problem_8_7;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 * Created by bskaja on 7/16/16.
 */
public class Problem1_IdenticalIntegerArraysTests {
    Problem1_IdenticalIntegerArrays solution = new Problem1_IdenticalIntegerArrays();

    @Test
    public void testSolution1() {
        Integer[] arr1 = new Integer[]{12, 1, 14, 16, 1, 1, 12 ,4};
        Integer[] arr2 = new Integer[]{14, 12, 1, 1, 12, 4, 1, 16};
        Integer[] arr3 = new Integer[]{1,2,3,4};
        Integer[] arr4 = new Integer[]{1, 1, 1, 1};
        Integer[] arr5 = new Integer[]{};
        Integer[] arr6 = new Integer[]{};

        assertTrue(solution.solution1(arr1, arr2));
        assertTrue(solution.solution1(arr5, arr5));
        assertTrue(solution.solution1(arr5, arr6));
        assertTrue(solution.solution1(null, null));

        assertFalse(solution.solution1(arr1, arr3));
        assertFalse(solution.solution1(arr1, arr4));
        assertFalse(solution.solution1(arr1, arr5));
        assertFalse(solution.solution1(arr5, arr1));
        assertFalse(solution.solution1(arr3, arr4));
    }

    @Test
    public void testSolution2() {
        Integer[] arr1 = new Integer[]{12, 1, 14, 16, 1, 1, 12 ,4};
        Integer[] arr2 = new Integer[]{14, 12, 1, 1, 12, 4, 1, 16};
        Integer[] arr3 = new Integer[]{1,2,3,4};
        Integer[] arr4 = new Integer[]{1, 1, 1, 1};
        Integer[] arr5 = new Integer[]{};
        Integer[] arr6 = new Integer[]{};

        assertTrue(solution.solution2(arr1, arr2));
        assertTrue(solution.solution2(arr5, arr5));
        assertTrue(solution.solution2(arr5, arr6));
        assertTrue(solution.solution2(null, null));

        assertFalse(solution.solution2(arr1, arr3));
        assertFalse(solution.solution2(arr1, arr4));
        assertFalse(solution.solution2(arr1, arr5));
        assertFalse(solution.solution2(arr5, arr1));
        assertFalse(solution.solution2(arr3, arr4));
    }

    @Test
    public void testSolution3() {
        Integer[] arr1 = new Integer[]{12, 1, 14, 16, 1, 1, 12 ,4};
        Integer[] arr2 = new Integer[]{14, 12, 1, 1, 12, 4, 1, 16};
        Integer[] arr3 = new Integer[]{1,2,3,4};
        Integer[] arr4 = new Integer[]{1, 1, 1, 1};
        Integer[] arr5 = new Integer[]{};
        Integer[] arr6 = new Integer[]{};

        assertTrue(solution.solution3(arr1, arr2));
        assertTrue(solution.solution3(arr5, arr5));
        assertTrue(solution.solution3(arr5, arr6));
        assertTrue(solution.solution3(null, null));

        assertFalse(solution.solution3(arr1, arr3));
        assertFalse(solution.solution3(arr1, arr4));
        assertFalse(solution.solution3(arr1, arr5));
        assertFalse(solution.solution3(arr5, arr1));
        assertFalse(solution.solution3(arr3, arr4));
    }
}