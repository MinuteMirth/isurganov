package ru.job4j.condition;
/**
 * //TODO add comments.
 *
 * @author Ivan Surganov (fuzzymuzzy32@gmail.com)
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

Point a = new Point(1, 2);

Point b = new Point(2, 1);

Point c = new Point(2, 0)

double ab = a - b;
double bc = b - c;
double cb = c - b;
double ba = b - a;
double ac = a - c;
double ca = c - a;


        if ((ab + bc > ac) && (ac + ab > bc))&& (cb + ba > ac)) {return sides} else {-1};
  }

  public double area() {
    Area area = new Area;
    area = a * b / 2;
    return if (c = Math.sqrt (a* a + b* b)) {return area} else {-1};
  }
}
