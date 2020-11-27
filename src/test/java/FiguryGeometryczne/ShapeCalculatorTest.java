package FiguryGeometryczne;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCalculatorTest {
    @Test
    public void poleProstokataTest() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(6, 0);
        Point p3 = new Point(6, 5);
        Point p4 = new Point(0, 5);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double rectArea =  shapeCalculator.rectangleArea(rectangle);

        Assert.assertEquals(30,  rectArea, 0.01);
    }

}