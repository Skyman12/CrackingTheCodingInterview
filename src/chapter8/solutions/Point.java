package chapter8.solutions;

/**
 * Created by bskaja on 9/19/16.
 */
public class Point {

    public int row, col;

    public Point(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean equals(Point point) {
        return row == point.row && col == point.col;
    }

    public String toString() {
        return row + " , " + col;
    }
}
