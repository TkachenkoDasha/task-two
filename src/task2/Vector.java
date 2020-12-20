package task2;

public class Vector {

    private Point pointA;
    private Point pointB;

    public Vector(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public double scalarProduct(Vector vector) {
        Point vector1 = this.findVectorValue();
        Point vector2 = vector.findVectorValue();

        return vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY();
    }

    public Point productByNumber(double number) {
        double x = number * this.findVectorValue().getX();
        double y = number * this.findVectorValue().getY();

        return new Point(x, y);
    }

    private Point findVectorValue() {
        double newX = this.getPointB().getX() - this.getPointA().getX();
        double newY = this.getPointB().getY() - this.getPointA().getY();

        return new Point(newX, newY);
    }
}
