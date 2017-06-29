import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleGuessTest {

	@Test(timeout=2000)
	public void test0() {
		int[] hints = new int[] { 1, 4, 5 };
		assertEquals(6, new SimpleGuess().getMaximum(hints));
	}

	@Test(timeout=2000)
	public void test1() {
		int[] hints = new int[] { 1, 4, 5, 8 };
		assertEquals(12, new SimpleGuess().getMaximum(hints));
	}

	@Test(timeout=2000)
	public void test2() {
		int[] hints = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		assertEquals(20, new SimpleGuess().getMaximum(hints));
	}

	@Test(timeout=2000)
	public void test3() {
		int[] hints = new int[] { 2, 100 };
		assertEquals(2499, new SimpleGuess().getMaximum(hints));
	}

	@Test(timeout=2000)
	public void test4() {
		int[] hints = new int[] { 50, 58, 47, 57, 40 };
		assertEquals(441, new SimpleGuess().getMaximum(hints));
	}
}
