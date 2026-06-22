import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem02Test {

	private final Problem02 p = new Problem02();

	@Test
	void smallCases() {
		assertEquals(2, p.countWays(2));
		assertEquals(3, p.countWays(3));
		assertEquals(5, p.countWays(4));
	}

	@Test
	void zeroStairs() {
		assertEquals(1, p.countWays(0));
	}

	@Test
	void oneStair() {
		assertEquals(1, p.countWays(1));
	}
}
