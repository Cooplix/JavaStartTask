package FiguryGeometryczne;

public class ShapeCalculator {
    public double lineLength(Point start, Point end) {
        double xPow = Math.pow(end.getX() - start.getX(), 2);
        double yPow = Math.pow(end.getY() - start.getY(), 2);
        double xyPowSum = xPow + yPow;
        return Math.sqrt(xyPowSum);
    }

    public double rectangleArea(Rectangle rectangle) {
        Point p1 = rectangle.getP1();
        Point p2 = rectangle.getP2();
        Point p3 = rectangle.getP3();
        Point p4 = rectangle.getP4();
        double sideA = lineLength(p1, p2);
        double sideB = lineLength(p1, p4);
        return sideA * sideB;
    }


    public boolean isPointInsideCircle(Circle circle, Point point) {
        double x = circle.getCenter().getX();
        double y = circle.getCenter().getY();
        double a = point.getX();
        double b = point.getY();
        double result = Math.pow((x-a), 2) + Math.pow((y-b), 2);
        double radiusPow = Math.pow(circle.getRadius(), 2);
        return result <= radiusPow;
    }
}
