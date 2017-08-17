package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class FactorialTest
 * @author Ivan Surganov (fuzzymuzzy32@gmail.com)
 * @version 1
 * @since 2017-08-017
 */
public class FactorialTest {
    /**
     * Testing add
     */
    @Test
    public void testCalcWithParamZero() {
        int param = 0, expected = 1;
        Factorial factorial = new Factorial();
        int result = factorial.calc(param);
        assertThat(result, is(expected));
    }
    /**
     * Testing add
     */
    @Test
    public void testCalcWithParamFive() {
        int param = 5, expected = 120;
        Factorial factorial = new Factorial();
        int result = factorial.calc(param);
        assertThat(result, is(expected));
    }
}