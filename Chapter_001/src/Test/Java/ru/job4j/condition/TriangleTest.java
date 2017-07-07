package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * //TODO add comments.
 *
 * @author Ivan Surganov (parsentev@yandex.ru)
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
public void whenAreaSetThreePointsThenTriangleArea() {
   Point a = new Point(0, 0);
   Point b = new Point(0, 2);
   Point c = new Point(2, 0);
   Triangle triangle = new Triangle(a, b, c);
   double result = triangle.area();
   double expected = 2D;
   assertThat(result, closeTo(expected, 0.1));
 }
}
