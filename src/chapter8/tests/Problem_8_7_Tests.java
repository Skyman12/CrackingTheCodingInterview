package chapter8.tests;

import chapter8.solutions.Problem_8_3;
import chapter8.solutions.Problem_8_7;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 * Created by bskaja on 7/16/16.
 */
public class Problem_8_7_Tests {
    Problem_8_7 solution = new Problem_8_7();

    @Test
    public void testSolution() {
        assertEquals(1, new HashSet<>(solution.solution1("a")).size());
        assertEquals(2, new HashSet<>(solution.solution1("ab")).size());
        assertEquals(6, new HashSet<>(solution.solution1("abc")).size());
        assertEquals(24, new HashSet<>(solution.solution1("abcd")).size());
        assertEquals(120, new HashSet<>(solution.solution1("abcde")).size());
    }
}