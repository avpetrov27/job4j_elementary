package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when00to00then0() {
        double expected = 0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when55to77then2dot8284() {
        double expected = 2.8284;
        Point a = new Point(5, 5);
        Point b = new Point(7, 7);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void whenMinus1Minus2toMinus4Minus6then5() {
        double expected = 5;
        Point a = new Point(-1, -2);
        Point b = new Point(-4, -6);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }
}
