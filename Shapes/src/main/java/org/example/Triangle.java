package org.example;

public class Triangle extends Shape {
    private Point leftBottom;
    private Point rightBottom;
    private Point top;
    private double a, b, c;

    public Triangle(Point leftBottom, Point rightBottom, Point top) {
        this.leftBottom = leftBottom;
        this.rightBottom = rightBottom;
        this.top = top;
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
