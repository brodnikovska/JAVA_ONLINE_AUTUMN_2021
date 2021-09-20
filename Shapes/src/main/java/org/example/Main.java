package org.example;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Controller controller =
                new Controller();
        Triangle triangle = controller.setTriangle(new Point(2, 4), new Point(10, 4), new Point(8, 54));

        System.out.println(triangle.perimeter());
        System.out.println(triangle.square());


    }
}
