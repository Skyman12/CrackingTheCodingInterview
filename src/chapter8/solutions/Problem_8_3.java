package chapter8.solutions;

/**
 * Magic Index:
 *
 * A magic index in an array A[0...n-1] is defined to be an index such that A[i] = i. Given a sorted array of distinct
 * integers, write a method to find a magic index, if one exists, in array A.
 *
 * Created by bskaja on 9/19/16.
 */
public class Problem_8_3 {

    // Bad solution - o(n)
    public int solution1 (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr[i]) return i;
        }

        return -1;
    }

    //better solution
    public int solution2(int[] arr) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + (max - min) / 2);

            // to the right
            if (arr[mid] < mid) {
                min = mid + 1;
            } else if (arr[mid] > mid) {
                max = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
