package pl.ontodata.springadhoc.adhoc.inherit.model;

import pl.ontodata.springadhoc.adhoc.Plusable;

/**
 * Created by bkolasa on 16.05.17.
 */
public class Point implements Plusable<Point> {

    private Integer x;
    private Integer y;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public Point plus(Point t1, Point t2) {
        return new Point(t1.getX() + t2.getX(), t1.getY() + t2.getY());
    }

    @Override
    public Point identity() {
        return new Point(0, 0);
    }
}
