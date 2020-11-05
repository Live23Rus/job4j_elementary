package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;

public class FitTest extends TestCase {

    @Test
    public void testManWeight() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void testWomanWeight() {
        short in = 170;
        double expected = 80.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}