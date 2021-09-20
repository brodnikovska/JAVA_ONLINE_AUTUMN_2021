package org.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestTriangle
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testPerimeter()
    {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 4), new Point(3, 0));
        Assert.assertEquals(12, triangle.perimeter(), 0.001);
    }
}
