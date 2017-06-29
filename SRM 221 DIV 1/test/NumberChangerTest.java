import org.junit.Test;
import static org.junit.Assert.*;

public class NumberChangerTest {

	@Test(timeout=2000)
	public void test0() {
		String start = "01234567";
		String finish = "01234567";
		assertEquals(0, new NumberChanger().transform(start, finish));
	}

	@Test(timeout=2000)
	public void test1() {
		String start = "11119999";
		String finish = "99991111";
		assertEquals(4, new NumberChanger().transform(start, finish));
	}

	@Test(timeout=2000)
	public void test2() {
		String start = "55555555";
		String finish = "12345678";
		assertEquals(16, new NumberChanger().transform(start, finish));
	}

	@Test(timeout=2000)
	public void test3() {
		String start = "77771111";
		String finish = "00446688";
		assertEquals(16, new NumberChanger().transform(start, finish));
	}

	@Test(timeout=2000)
	public void test4() {
		String start = "12";
		String finish = "30";
		assertEquals(3, new NumberChanger().transform(start, finish));
	}
}
