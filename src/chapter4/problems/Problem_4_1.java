package chapter4.problems;

import java.util.Arrays;

/**
 *
 * Created by bskaja on 7/17/16.
 */
public class Problem_4_1 {

    public int solution1(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return fibonacci(n, memo);
    }

    public int fibonacci(int n, int[] memo) {
        if (n == 0 || n == 1) return n;

        if (memo[n] != -1) {
            return memo[n];
        }

        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);

        return memo[n];
    }

    public int solution2(int n) {
        int a = 0;
        int b = 1;

        for (int i = 2; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return a+b;
    }
}
