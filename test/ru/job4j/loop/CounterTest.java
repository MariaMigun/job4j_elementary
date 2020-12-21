package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;;

public class CounterTest {

    @Test
    public void whenSumEvenNumberFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumberFromTwoToSixThenTwelve() {
        int rsl = Counter.sumByEven(2, 6);
        int expected = 12;
        assertThat(rsl, is(expected));
    }
}