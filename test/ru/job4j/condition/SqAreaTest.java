package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void when62then() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p,k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when122then() {
        int expected = 4;
        int p = 12;
        int k = 2;
        double out = SqArea.square(p,k);
        Assert.assertEquals(expected, out, 0.01);
    }
}