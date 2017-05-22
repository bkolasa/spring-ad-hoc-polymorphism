package pl.ontodata.springadhoc.adhoc;

import org.springframework.stereotype.Component;
import pl.ontodata.springadhoc.adhoc.model.Point;

/**
 * Created by bkolasa on 16.05.17.
 */
@Component
public class PointPlusableOps implements Plusable<Point> {
    public Point plus(Point t1, Point t2) {
        return new Point(t1.getX() + t2.getX(), t1.getY() + t2.getY());
    }

    @Override
    public Point identity() {
        return new Point(0,0);
    }
}
