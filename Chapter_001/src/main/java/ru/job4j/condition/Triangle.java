package ru.job4j.condition;
/**
 * @author Ivan Surganov
 * @version 1.0.0
 */
public class Triangle {

  /**
   * 1 top
   */
  private Point a;
  /**
   * 2 top
   */
  private Point b;
  /**
   * 3 top
   */
  private Point c;
  /**
   * tops
   *@param a top
   *@param b top
   *@param c top
   */
  public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  /**
   * Lets find top
   *@return result s
   */
  public double area() {
    /**
     * distance
     */
    double ab = a.distanceTo(b);
    double bc = b.distanceTo(c);
    double ac = a.distanceTo(c);

    /**
     * Gerons
     */
    double p = (ab + bc + ac) / 2;
    double result = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    /**
     * Checking
     */
    if (result == 0) {
      return -1;
    } else {
      return result;
    }
  }

}