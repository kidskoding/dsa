import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem24Test {

	private final Problem24 p = new Problem24();

	@Test
	void typical() {
		assertEquals(5, p.findTargetSumWays(new int[] {1, 1, 1, 1, 1}, 3));
	}

	@Test
	void singleReachable() {
		assertEquals(1, p.findTargetSumWays(new int[] {1}, 1));
	}

	@Test
	void singleUnreachable() {
		assertEquals(0, p.findTargetSumWays(new int[] {1}, 2));
	}
}
