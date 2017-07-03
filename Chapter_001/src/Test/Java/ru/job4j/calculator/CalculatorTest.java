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
/**
* Calculator.
*@param first first argument.
*@param second second argument.
*/
public class CalculatorTest {
  /**
   * Test add.
   *Values.
   */
    @Test
    public void whenAddOnePlusOneThenTwo() {
      /**
     * Default.
     * @param values values.
     */
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
        }
        /**
        * Calculator.
        */
    public void whenAddOneMinusOneThenZero() {
      Calculator calc = new Calculator();
      calc.add(1D, 1D);
      double result = calc.getResult();
      double expected = 0D;
      assertThat(result, is(expected));
        }
        /**
        * Calculator.
        */
    public void whenAddOneMultipliedByOneThenOne() {
      /**
     * Default.
     * @param values values.
     */
       Calculator calc = new Calculator();
       calc.add(1D, 1D);
       double result = calc.getResult();
       double expected = 1D;
       assertThat(result, is(expected));
        }
        /**
        * Calculator.
        */
    public void whenAddOneDividedByOneThenOne() {

           Calculator calc = new Calculator();
           calc.add(1D, 1D);
           double result = calc.getResult();
           double expected = 1D;
           assertThat(result, is(expected));
       }
}
