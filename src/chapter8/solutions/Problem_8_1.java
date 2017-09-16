package chapter8.solutions;

/**
 * Triple Step:
 *
 * A child is running up a staircase with n steps and can either hop 1, 2 or 3 steps at a time.
 * Design a method that will ount the number of possible ways the child can run up n stairs.
 * Created by bskaja on 9/19/16.
 */
public class Problem_8_1 {

    public int count(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }

        return count(n, arr);
    }

    private int count(int n, int[] arr) {
        if (n == 0) return 1;
        if (n < 0) return 0;

        if (arr[n] != 0) return arr[n];

        arr[n] = count(n-1, arr) + count(n-2, arr) + count(n-3, arr);

        return arr[n];
    }

}
