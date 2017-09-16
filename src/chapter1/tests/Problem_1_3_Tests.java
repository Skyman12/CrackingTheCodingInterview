package chapter1.tests;

import chapter1.solutions.Problem_1_2;
import chapter1.solutions.Problem_1_3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * Created by bskaja on 7/16/16.
 */
public class Problem_1_3_Tests {
    Problem_1_3 solution = new Problem_1_3();
    String test1 = "Mr John Smith";
    String test2 = "   ";


    @Test
    public void testSolution1() {
        assertEquals("Mr%20John%20Smith" , solution.solution1(test1));
        assertEquals("%20%20%20" , solution.solution1(test2));
    }
}