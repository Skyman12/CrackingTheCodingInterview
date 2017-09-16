package chapter8.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Robot in a Grid:
 *
 * Imagine a robot sitting on the upper left corner of a grid with n
 * Created by bskaja on 9/19/16.
 */
public class Problem_8_2 {
    public List<Point> findPath(boolean[][] maze) {
        Set<Point> failedPoints = new HashSet<>();
        List<Point> path = new ArrayList<>();

        if (getPath(maze, path, failedPoints, new Point(maze.length - 1, maze[0].length - 1))) {
            return path;
        }

        return null;
    }

    private boolean getPath(boolean[][] maze, List<Point> path, Set<Point> failedPoints, Point currentPoint) {
        // if have already been here, return false
        if (failedPoints.contains(currentPoint)) {
            return false;
        }

        //out of bounds or not a valid place
        if (currentPoint.row < 0 || currentPoint.col < 0 || !maze[currentPoint.row][currentPoint.col]) {
            failedPoints.add(currentPoint);
            return false;
        }
        // Add this point to the path
        path.add(currentPoint);

        // Valid path found
        if (currentPoint.row == 0 && currentPoint.col == 0) {
            return true;
        }

        //otherwise, move left and up
        return getPath(maze, path, failedPoints, new Point(currentPoint.row, currentPoint.col - 1)) ||
                getPath(maze, path, failedPoints, new Point(currentPoint.row - 1, currentPoint.col));
    }
}
