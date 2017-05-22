package pl.ontodata.springadhoc;

/**
 * Created by bkolasa on 16.05.17.
 */
public class Point {
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
}
