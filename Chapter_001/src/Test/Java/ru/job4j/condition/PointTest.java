package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * //TODO add comments.
 *
 * @author Ivan Surganov (fuzzymuzzy32@gmail.com)
 * @version 1.0.0
 * @since 3.07.2017
 */
 public class PointTest {
   /*Testing max task.
   *
   */
   /**
   *Test.
   */
   @Test
   /**
   Belonging to function.
   */
   public void whenYBelongsToFunctionThenTrue() {
     Point point = new Point(1, 2);
     boolean result = point.is(0, 0);
     assertThat(result, is(false));

   }
 }
