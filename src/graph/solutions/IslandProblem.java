package graph.solutions;

/**
 * Created by bskaja on 9/18/17.
 */
public class IslandProblem {

  private boolean[][] visited;

  public int getNumberOfIslands(final int[][] arr) {

    visited = new boolean[arr.length][arr[0].length];
    int count = 0;

    for (int row = 0; row < arr.length; row++) {

      for (int col = 0; col < arr[0].length; col++) {
        // If this isn't part of an island already and this is part of an island
        if (!visited[row][col] && arr[row][col] == 1) {
          searchIsland(row, col, arr);
          count++;
        }

        visited[row][col] = true;
      }
    }

    return count;
  }

  /**
   * Depth first search to find the islands.
   * @param row row.
   * @param col col.
   * @param arr the map.
   */
  public int searchIsland(final int row, final int col, final int[][] arr) {
    // Check for out of bounds
    if (row >= arr.length || row < 0 || col >= arr[0].length || col < 0) {
      return 0;
    }

    // If this we have already visited or this is not part of the island.
    if (arr[row][col] == 0 || visited[row][col]) {
      visited[row][col] = true;
      return 0;
    }

    // Mark we have visited
    visited[row][col] = true;

    int sum = 1;
    // Check all places, besides the place we are currently at.
    for (int r = -1; r < 2; r++) {
      for (int c = -1; c < 2; c++) {
        if (r == 0 && c == 0) {
          continue;
        }

        searchIsland(row + r, col + c, arr);
      }
    }

    return sum;
  }

}
