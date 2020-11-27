package FiguryGeometryczne;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCalculatorTest {
    private ShapeCalculator shapeCalculator = new ShapeCalculator();
    @Test
    public void poleProstokataTest() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(6, 0);
        Point p3 = new Point(6, 5);
        Point p4 = new Point(0, 5);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);

        double rectArea =  shapeCalculator.rectangleArea(rectangle);

        Assert.assertEquals(30,  rectArea, 0.01);
    }

    @Test
    public void isPointInsideCircle() {
        Point center = new Point(0,0);
        Circle circle = new Circle(center, 5);
        Point ok = new Point(0,3);
        boolean pointInsideCircle = shapeCalculator.isPointInsideCircle(circle, ok);

        Assert.assertEquals(pointInsideCircle, true);
    }

    @Test
    public void isPointNotInsideCircle() {
        Point center = new Point(0,0);
        Circle circle = new Circle(center, 5);
        Point notOk = new Point(0, 6);
        boolean pointInsideCircle = shapeCalculator.isPointInsideCircle(circle, notOk);

        Assert.assertEquals(pointInsideCircle, false);
    }

}