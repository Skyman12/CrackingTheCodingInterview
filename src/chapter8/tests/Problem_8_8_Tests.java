package chapter8.tests;

import chapter8.solutions.Problem_8_7;
import chapter8.solutions.Problem_8_8;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

/**
 *
 * Created by bskaja on 7/16/16.
 */
public class Problem_8_8_Tests {
    Problem_8_8 solution = new Problem_8_8();

    @Test
    public void testSolution() {
        assertEquals(1, solution.solution1("a").size());
        assertEquals(2, solution.solution1("ab").size());
        assertEquals(6, solution.solution1("abc").size());
        assertEquals(3, solution.solution1("abb").size());
        assertEquals(4, solution.solution1("abbb").size());
        assertEquals(24, solution.solution1("abcd").size());
        assertEquals(1120, solution.solution1("abbbcccd").size());
    }
}