import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem26Test {

	private final Problem26 p = new Problem26();

	@Test
	void twoLongest() {
		assertEquals(2, p.findNumberOfLIS(new int[] {1, 3, 5, 4, 7}));
	}

	@Test
	void allEqual() {
		assertEquals(5, p.findNumberOfLIS(new int[] {2, 2, 2, 2, 2}));
	}

	@Test
	void threeLongest() {
		assertEquals(3, p.findNumberOfLIS(new int[] {1, 2, 4, 3, 5, 4, 7, 2}));
	}
}
