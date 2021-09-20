package org.example;

public class Controller {

    public Triangle setTriangle(Point pointLeftBottom, Point pointRightBottom, Point pointTop) {
        Triangle triangle = null;
        try {
            triangle = new Triangle(pointLeftBottom, pointRightBottom, pointTop);

        } catch (NotValidTriangleException e) {
            e.printStackTrace();
        }
        return triangle;
    }
}
