package ru.job4j.calculator;
/**
 * Test.
 *
 * @author Ivan Surganov (fuzzymuzzy32@gmail.com)
 * @version 1.0.0
 * @since 1.07.2017
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
  /**
   * Test add.
   */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
        }
    public void whenAddOneMinusOneThenZero() {
      Calculator calc = new Calculator();
      calc.add(1D,1D);
      double result = calc.getResult();
      double expected = 0D;
      assertThat(result,is(expected));
        }
    public void whenAddOneMultipliedByOneThenOne() {
       Calculator calc = new Calculator();
       calc.add(1D,1D);
       double resul t = calc.getResult();
       double expected = 1D;
       asserThat(result,is(expected));
        }
    public void whenAddOneDividedByOneThenOne() {
           Calculator calc = new Calculator();
           calc.add(1D,1D);
           double result = calc.getResult();
           double expected = 1D;
           asserThat(result,is(expected));
       }
}
