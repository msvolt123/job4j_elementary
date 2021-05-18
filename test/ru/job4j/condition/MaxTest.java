package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax17To11Then17() {
        int left = 17;
        int right = 11;
        int result = Max.max(left, right);
        int expected = 17;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax11To17Then17() {
        int left = 11;
        int right = 17;
        int result = Max.max(left, right);
        int expected = 17;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax11To11Then11() {
        int left = 11;
        int right = 11;
        int result = Max.max(left, right);
        int expected = 11;
        Assert.assertEquals(result, expected);
    }
}