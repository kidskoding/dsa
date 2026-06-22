import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem1Test {

	private final Problem1 p = new Problem1();

	@Test
	void twoStairs() {
		assertEquals(2, p.climbStairs(2));
	}

	@Test
	void threeStairs() {
		assertEquals(3, p.climbStairs(3));
	}

	@Test
	void fiveStairs() {
		assertEquals(8, p.climbStairs(5));
	}
}
