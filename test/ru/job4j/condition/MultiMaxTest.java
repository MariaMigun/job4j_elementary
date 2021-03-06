package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(10, 4, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenThirdEqSecond() {
        int result = MultiMax.max(1, 100, 100);
        assertThat(result, is(100));
    }
}