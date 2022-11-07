package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTestTest {

    @Test
    public void whenMan168Then78() {
        short in = 168;
        double expected = 78.2;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenWoman160Then57() {
        short in = 160;
        double expected = 57.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}