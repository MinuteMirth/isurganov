package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcreest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
*
*Test
*@author. Ivan Surganov (fuzzymuzzy32@gmail.com)
*@version. 1.0.0
*@since 24.06.2017
*/
public class calculateTest {
     /**
     *Test add.
     */
     @Test
     publick void whenAddOneToOneThenTwo() {
          ByteArrayOutputStream out=new ByteArrayOutputStream();
          System.setOut(new PrintStream(out));
          Calculate.main(null);
          assertThat(
          out.toString(),
          is("Hello world\r\n")
          )
          );
     }
}
