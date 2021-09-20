package org.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestTriangle
{

    @Test
    public void testPerimeter()
    {
        Triangle triangle = null;
        try {
            triangle = new Triangle(new Point(0, 0), new Point(0, 4), new Point(3, 0));
        } catch (NotValidTriangleException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(12, triangle.perimeter(), 0.001);
    }

    @Test
    public void testSquare()
    {
        Triangle triangle = null;
        try {
            triangle = new Triangle(new Point(0, 0), new Point(0, 6), new Point(3, 3));
        } catch (NotValidTriangleException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(9, triangle.square(), 0.001);
    }
}
