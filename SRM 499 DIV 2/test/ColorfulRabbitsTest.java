import org.junit.Test;
import static org.junit.Assert.*;

public class ColorfulRabbitsTest {

	@Test(timeout=2000)
	public void test0() {
		int[] replies = new int[] { 1, 1, 2, 2 }
;
		assertEquals(5, new ColorfulRabbits().getMinimum(replies));
	}

	@Test(timeout=2000)
	public void test1() {
		int[] replies = new int[] { 0 }
;
		assertEquals(1, new ColorfulRabbits().getMinimum(replies));
	}

	@Test(timeout=2000)
	public void test2() {
		int[] replies = new int[] { 2, 2, 44, 2, 2, 2, 444, 2, 2 }
;
		assertEquals(499, new ColorfulRabbits().getMinimum(replies));
	}
}
