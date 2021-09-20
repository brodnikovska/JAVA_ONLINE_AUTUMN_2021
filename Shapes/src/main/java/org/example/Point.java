package org.example;

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static double getDistanceBetweenTwoPoints(Point firstPoint, Point secondPoint) {
        return Math.sqrt(Math.pow((firstPoint.getX() - secondPoint.getX()), 2) + Math.pow((firstPoint.getY()-secondPoint.getY()), 2));
    }
}
