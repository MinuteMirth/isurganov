package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
      Counter count = new Counter();
      count.add(2, 4 , 6 , 8 , 10);
      double result = count.getResult();
      double expected = 30;
      assertThat(result, is(expected));
    }
}
