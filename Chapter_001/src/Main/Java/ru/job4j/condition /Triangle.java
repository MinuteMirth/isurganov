package ru.job4j.condition;
/**
 * //TODO add comments.
 *
 * @author Ivan Surganov (parsentev@yandex.ru)
 * @version 1.0.0
 * @since 4.07.2017
 */
/**
*Class for Triangle  task.
*/
public class Triangle {
  private Point a;
  private Point b;
  private Point c;


  public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public double sides(){
    return if (this.a + this.b - this.c > 0) {return sides} else {-1};
  }

  public double area() {
    return if (area>0) {return area} else {-1};
  }
}
