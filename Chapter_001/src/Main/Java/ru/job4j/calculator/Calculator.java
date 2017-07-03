package ru.job4j.calculator;
/**
* Calculator.
*
* @author Ivan Surganov(fuzzymuzzy32@gmail.com)
* @version 1.0.0
* @since 1.07.2017
*/
public class Calculator {
/**
* Calculator.
*@param first first argument.
*@param second second argument.
*/

private double result;
/**
* Calculator.
*@param first first argument.
*@param second second argument.
*/

public void add(double first, double second) {

this.result = first + second;
}
/**
* Calculator.
*@param first-int
*@param secod-int
*/

/**
* Calculator.
*@param first first argument.
*@param second second argument.
*/
public void substract(double first, double second) {

this.result = first * second;
}
/**
* Calculator.
*@param first first argument.
*@param second second argument.
*/
public void divide(double first, double second) {

this.result = first / second;
}
/**
* Calculator.
*@param first first argument.
*@param second second argument.
*/
/**
* Calculator.
*@param first first argument.
*@param second second argument.
*/
public void negate(double first, double second) {

this.result = first - second;
}
/**
* Calculator.
*@param first-int
*@param secod-int
*@return result.
*/

public double getResult() {

return this.result;
}
/**
* Calculator.
*@param first-int
*@param secod-int
*/
}
