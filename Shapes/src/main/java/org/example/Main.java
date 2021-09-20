package org.example;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Triangle triangle = new Triangle(new Point(2, 4), new Point(10, 4), new Point(8, 9));
        System.out.println(triangle.perimeter());
        System.out.println(triangle.square());

    }
}
