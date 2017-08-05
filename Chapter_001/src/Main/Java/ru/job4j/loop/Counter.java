package ru.job4j.loop;
/**
 * //TODO add comments.
 *
 * @author Ivan Surganov (fuzzymuzzy32@gmail.com)
 * @version 1.0.0
 * @since 15.07.2017
 */
/**
*Class for Counter task.
*/
public class Counter {
  public int add(int start, int finish) {
  int sum = 0;
  for (int i= start; i <= finish; i++ ) {
    if (i % 2 == 0) {
      sum = sum + i;
    }
  }
  return sum;


  }


}
