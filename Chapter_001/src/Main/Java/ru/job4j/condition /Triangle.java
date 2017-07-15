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
    int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if ((a+b>c) && (a+c>b) && (c+b>a)) {return sides} else {-1};
  }

  public double area() {
    Area area = new Area;
    area = a * b / 2;
    return if (c = Math.sqrt (a* a + b* b)) {return area} else {-1};
  }
}
