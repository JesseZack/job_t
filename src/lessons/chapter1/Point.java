package lessons.chapter1;
/**
 * @version 1.0.0
 */

/** Class Point Represents two-dimensional geometrical points.*/
public class Point {
    private int x, y;
    /**
     * Constructor for the point class that takes in two int values representing the x and y coordinates
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     */

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    /**
     * Return the <b style="color:powderblue">x-coordinate</b> of the poitn
     * @return the x coordinate of the point
     * */
    public int getX() {
        return x;
    }

    /**
     * Return the <b style="color:red">y-coordinate</b> of the point.
     * @return the y coordinate of the point
     * */
    public int getY() {
        return y;
    }
}
