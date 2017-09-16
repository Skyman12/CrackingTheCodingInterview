package chapter1.tests;

import chapter1.solutions.Problem_1_1;
import chapter4.Problem_4_1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * Created by bskaja on 7/16/16.
 */
public class Problem_4_1_Tests {
    Problem_4_1 solution = new Problem_4_1();

    @Test
    public void testSolution1() {
        assertEquals(2, solution.solution1(3));
        assertEquals(3, solution.solution1(4));
        assertEquals(5, solution.solution1(5));
        assertEquals(8, solution.solution1(6));
        assertEquals(13, solution.solution1(7));
    }

    @Test
    public void testSolution2() {
        assertEquals(2, solution.solution2(3));
        assertEquals(3, solution.solution2(4));
        assertEquals(5, solution.solution2(5));
        assertEquals(8, solution.solution2(6));
        assertEquals(13, solution.solution2(7));
    }
}