import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplyXPlusOneTest {

	@Test(timeout=2000)
	public void test0() {
		int s = 1;
		int t = 22;
		assertEquals(3, new MultiplyXPlusOne().minimalSteps(s, t));
	}

	@Test(timeout=2000)
	public void test1() {
		int s = 1;
		int t = 31;
		assertEquals(3, new MultiplyXPlusOne().minimalSteps(s, t));
	}

	@Test(timeout=2000)
	public void test2() {
		int s = 100;
		int t = 99;
		assertEquals(-1, new MultiplyXPlusOne().minimalSteps(s, t));
	}

	@Test(timeout=2000)
	public void test3() {
		int s = 55555;
		int t = 1000000;
		assertEquals(3, new MultiplyXPlusOne().minimalSteps(s, t));
	}

	@Test(timeout=2000)
	public void test4() {
		int s = 1;
		int t = 1;
		assertEquals(0, new MultiplyXPlusOne().minimalSteps(s, t));
	}
}
