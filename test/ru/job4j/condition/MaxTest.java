package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void max() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
}