package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTestTest {

    @Test
    public void when32to75then5() {
        double expected = 5;
        int x1 = 3;
        int y1 = 2;
        int x2 = 7;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when45to87then4and47() {
        double expected = 4.47;
        int x1 = 4;
        int y1 = 5;
        int x2 = 8;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to612then9and48() {
        double expected = 9.48;
        int x1 = 3;
        int y1 = 3;
        int x2 = 6;
        int y2 = 12;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}