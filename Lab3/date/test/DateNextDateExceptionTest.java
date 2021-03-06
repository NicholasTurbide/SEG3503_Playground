import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest
{

  private int year;
  private int month;
  private int day;

  public DateNextDateExceptionTest(int year, int month, int day)
  {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  @Parameters
  public static List<Integer[]> data( )
  {
    List<Integer[]> params = new LinkedList<Integer[]>( );
    params.add(new Integer[] {4356, 13, 4});
    params.add(new Integer[] {400, 1, 32});
    params.add(new Integer[] {-1, 11, 30});
    params.add(new Integer[] {1, -11, 3});
    params.add(new Integer[] {1000, 4, -3});
    params.add(new Integer[] {2000, 02, 31});
    params.add(new Integer[] {2001, 02, 29});
    return params;
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNextDate()
  {
    new Date(year, month, day);
  }

}
