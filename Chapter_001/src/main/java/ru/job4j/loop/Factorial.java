package ru.job4j.loop;
/**
 * //TODO add comments.
 *
 * @author Ivan Surganov (fuzzymuzzy32@gmail.com)
 * @version 1.0.0
 * @since 08.17.2017
 */
/**
 *Class for Factorial task.
 */

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = 1; // this  will be the result
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    }