package ru.job4j.condition;

/**
 * //TODO add comments.
 *
 * @author Ivan Surganov (fuzzymuzzy32@gmail.com)
 * @version 1.0.0
 * @since 4.07.2017
 */
/**
*Class for Point task.
*/
public class Point {
  /**
  *X.
  */
   private int x;
   /**
   *Y.
   */
   private int y;

/**
*Point coordinates.
*@param x x.
*@param y y.
*/

   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
  /**
  *X meaning.
  *@return x
  */

  public int getX() {
      return this.x;
  }
  /**
  *Y meaning.
  *@return y
  */

  public int getY() {
     return this.y;
  }
  /**
  *Getting point coordinates.
  *@return x,y
  *@param b b
  *@param a a
  */

  public boolean is(int a, int b) {
  return this.y == a * x + b;
  }
}
