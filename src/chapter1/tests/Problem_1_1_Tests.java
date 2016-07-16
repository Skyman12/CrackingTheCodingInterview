package chapter1.tests;

import chapter1.solutions.Problem_1_1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * Created by bskaja on 7/16/16.
 */
public class Problem_1_1_Tests {
    Problem_1_1 solution = new Problem_1_1();
    String test1 = "abcdefghijklmnopqrstuvwxyz1234567890";
    String test2 = "aweryas";
    String test3 = "";
    String test4 ="a";
    String test5 = "aa";

    @Test
    public void testSolution1() {
        assertEquals(true, solution.solution1(test1));
        assertEquals(false, solution.solution1(test2));
        assertEquals(true, solution.solution1(test3));
        assertEquals(true, solution.solution1(test4));
        assertEquals(false, solution.solution1(test5));
    }

    @Test
    public void testSolution2() {
        assertEquals(true, solution.solution2(test1));
        assertEquals(false, solution.solution2(test2));
        assertEquals(true, solution.solution2(test3));
        assertEquals(true, solution.solution2(test4));
        assertEquals(false, solution.solution2(test5));
    }

    @Test
    public void testSolution3() {
        assertEquals(true, solution.solution3(test1));
        assertEquals(false, solution.solution3(test2));
        assertEquals(true, solution.solution3(test3));
        assertEquals(true, solution.solution3(test4));
        assertEquals(false, solution.solution3(test5));
    }
}