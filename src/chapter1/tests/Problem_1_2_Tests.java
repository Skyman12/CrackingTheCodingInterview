package chapter1.tests;

import chapter1.solutions.Problem_1_1;
import chapter1.solutions.Problem_1_2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * Created by bskaja on 7/16/16.
 */
public class Problem_1_2_Tests {
    Problem_1_2 solution = new Problem_1_2();
    String test1_1 = "cat";
    String test1_2 = "tac";

    String test2_1 = "";
    String test2_2 = "tac";

    String test3_1 = "cat";
    String test3_2 = "   ";

    String test4_1 = "cat";
    String test4_2 = "cat";

    String test5_1 = "test";
    String test5_2 = "cat";


    @Test
    public void testSolution1() {
        assertEquals(true, solution.solution1(test1_1, test1_2));
        assertEquals(false, solution.solution1(test2_1, test2_2));
        assertEquals(false, solution.solution1(test3_1, test3_2));
        assertEquals(true, solution.solution1(test4_1, test4_2));
        assertEquals(false, solution.solution1(test5_1, test5_2));
    }

    @Test
    public void testSolution2() {
        assertEquals(true, solution.solution2(test1_1, test1_2));
        assertEquals(false, solution.solution2(test2_1, test2_2));
        assertEquals(false, solution.solution2(test3_1, test3_2));
        assertEquals(true, solution.solution2(test4_1, test4_2));
        assertEquals(false, solution.solution2(test5_1, test5_2));
    }
}