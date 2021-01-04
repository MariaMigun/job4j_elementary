package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void maxnum() {
        Max maximum = new Max();
        int number = maximum.maxnum(1, 2, 3);
        assertThat(number, is(3));
    }
}