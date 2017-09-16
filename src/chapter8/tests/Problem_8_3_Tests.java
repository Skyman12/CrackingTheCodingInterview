package chapter8.tests;

import chapter1.solutions.Problem_1_2;
import chapter8.solutions.Problem_8_3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * Created by bskaja on 7/16/16.
 */
public class Problem_8_3_Tests {
    Problem_8_3 solution = new Problem_8_3();

    int[] test1 = {-2,-1, 0, 1,3,4,6,7};
    int[] test2 = {-2, -1, 2, 4, 6, 7, 8, 9, 10};
    int[] test3 = {1,2,3};

    @Test
    public void testSolution1() {
        assertEquals(6, solution.solution1(test1));
        assertEquals(2, solution.solution1(test2));
        assertEquals(-1, solution.solution1(test3));
    }

    @Test
    public void testSolution2() {
        assertEquals(6, solution.solution2(test1));
        assertEquals(2, solution.solution2(test2));
        assertEquals(-1, solution.solution2(test3));
    }
}