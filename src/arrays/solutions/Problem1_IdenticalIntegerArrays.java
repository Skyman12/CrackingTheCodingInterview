package arrays.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bskaja on 9/16/17.
 *
 */
public class Problem1_IdenticalIntegerArrays {

  /**
   * O(n^2) solution.
   * @param arr1 arr1.
   * @param arr2 arr2.
   * @return true if the arrays contain identical contents. False otherwise.
   */
  public boolean solution1(Integer[] arr1, Integer[] arr2) {
    // If the objects point to the same reference (or are both null)
    if (arr1 == arr2) return true;

    // If either one is null
    if (arr1 == null || arr2 == null) return false;

    // Different length arrays cant be the same
    if (arr1.length != arr2.length) return false;

    // For every element in arr1, see if its in arr2. If we find it, null out that element in arr2.
    for (Integer anArr1 : arr1) {
      boolean found = false;
      for (int j = 0; j < arr2.length; j++) {
        if (anArr1.equals(arr2[j])) {
          arr2[j] = null;
          found = true;
          break;
        }
      }

      if (!found) return false;
    }

    return true;
  }

  /**
   * O(n * log(n)) solution using sorting.
   * @param arr1 arr1.
   * @param arr2 arr2.
   * @return true if the arrays contain identical contents. False otherwise.
   */
  public boolean solution2(Integer[] arr1, Integer[] arr2) {
    // If the objects point to the same reference (or are both null)
    if (arr1 == arr2) return true;

    // If either one is null
    if (arr1 == null || arr2 == null) return false;

    // Different length arrays cant be the same
    if (arr1.length != arr2.length) return false;

    // Uses TimSort, a hybrid merge sort algorithm.
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    for (int i = 0; i < arr1.length; i++) {
      if (!arr1[i].equals(arr2[i])) return false;
    }

    return true;
  }

  /**
   * O(n) solution using hashmap.
   * @param arr1 arr1.
   * @param arr2 arr2.
   * @return true if the arrays contain identical contents. False otherwise.
   */
  public boolean solution3(Integer[] arr1, Integer[] arr2) {
    // If the objects point to the same reference (or are both null)
    if (arr1 == arr2) return true;

    // If either one is null
    if (arr1 == null || arr2 == null) return false;

    // Different length arrays cant be the same
    if (arr1.length != arr2.length) return false;

    HashMap<Integer, Integer> map = new HashMap<>();

    for (Integer i : arr1) {
      if (map.containsKey(i)) map.put(i, map.get(i) + 1);
      else map.put(i, 1);
    }

    for (Integer i : arr2) {
      if (!map.containsKey(i)) return false;
      else map.put(i, map.get(i) - 1);
    }

    for (Integer i : map.values()) {
      if (!i.equals(0)) return false;
    }

    return true;
  }
}
