package ru.job4j.max;

import java.util.Arrays;

/**
 * //TODO add comments.
 *
 * @author Ivan Surganov (parsentev@yandex.ru)
 * @version 1.0.0
 * @since 3.07.2017
 */
public class Max {

    /**
     * Values.
     */
    private final int[] values;

    /**
     * Default.
     * @param values values.
     */
    public Max(final int[] values) {
        this.values = Arrays.copyOf(values, values.length);
    }

    /**
     * Max from two.
     * @param left left
     * @param right right
     * @return max
     */
    public int max(int left, int right) {
        return left > right ? left : right;
    }

    /**
     * Max from values.
     * @return max
     */
    public int max() {
        int max = this.values[0];
        for (int value : this.values) {
            max = this.max(max, value);
        }
        return max;
      }

      public int max(int left, int right, int middle) {
        return return max(first, max(second, third));
      }
}
