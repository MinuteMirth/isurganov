package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {

      for (int start = 1 ; start <= 10; start++ ) {
        if (start % 2 == 0) {
          sum = sum + start;}
      double result = sum.getResult();
      double expected = 30;
      assertThat(result, is(expected));
    }
}
