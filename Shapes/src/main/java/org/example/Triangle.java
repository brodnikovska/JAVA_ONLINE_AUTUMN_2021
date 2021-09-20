package org.example;

public class Triangle extends Shape {
    private Point leftBottom;
    private Point rightBottom;
    private Point top;
    private double a, b, c;

    public Point getLeftBottom() {
        return leftBottom;
    }

    public Point getRightBottom() {
        return rightBottom;
    }

    public Point getTop() {
        return top;
    }

    public Triangle(Point leftBottom, Point rightBottom, Point top) throws NotValidTriangleException {
        if (!isTriangleValid(leftBottom, rightBottom, top))     {
            throw new NotValidTriangleException("The sum of two lengths in triangle must be more than the third length");
        }
        this.leftBottom = leftBottom;
        this.rightBottom = rightBottom;
        this.top = top;
    }

    public boolean isTriangleValid(Point leftBottom, Point rightBottom, Point top) {
        double[] lengths = new double[] {Point.getDistanceBetweenTwoPoints(leftBottom, rightBottom),
                Point.getDistanceBetweenTwoPoints(leftBottom, top), Point.getDistanceBetweenTwoPoints(rightBottom, top)};
        return ((lengths[0] + lengths[1]) > lengths[2]) & ((lengths[0] + lengths[2]) > lengths[1]) & ((lengths [1] + lengths[2]) > lengths[0]);
    }

    @Override
    public double perimeter() {
        return Point.getDistanceBetweenTwoPoints(leftBottom, rightBottom) + Point.getDistanceBetweenTwoPoints(leftBottom, top)
                + Point.getDistanceBetweenTwoPoints(rightBottom, top);
    }

    @Override
    public double square() {
        double halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - Point.getDistanceBetweenTwoPoints(leftBottom, rightBottom))
        * (halfPerimeter - Point.getDistanceBetweenTwoPoints(leftBottom, top)) * (halfPerimeter - Point.getDistanceBetweenTwoPoints(rightBottom, top)));
    }

    @Override
    public void move(double dx, double dy) {
        leftBottom.setX(leftBottom.getX() + dx);
        leftBottom.setY(leftBottom.getY() + dy);
        rightBottom.setX( rightBottom.getX() + dx);
        rightBottom.setY( rightBottom.getY() + dy);
        top.setX(top.getX() + dx);
        top.setY(top.getY() + dy);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
