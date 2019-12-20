import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComputeParityTest {

  private short expected;
  private long n;


  @Test
  public void parity1() {
    expected = 0;
    n = 0;

    test(expected, n);
  }

  @Test
  public void parity2() {
    expected = 1;
    n = 1;

    test(expected, n);
  }

  @Test
  public void parity3() {
    expected = 1;
    n = 2;

    test(expected, n);
  }


  @Test
  public void parity4() {
    expected = 0;
    n = 152950;

    test(expected, n);
  }

  // EXTRA TEST
  @Test
  public void parity5() {
    expected = 0;
    n = 3;

    test(expected, n);
  }

  private void test(short expected, long n) {
    assertEquals(expected, ComputeParity.parity(n));
  }


}