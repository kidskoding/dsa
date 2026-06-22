import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	private final Problem12 p = new Problem12();

	@Test
	void circleBlocksEnds() {
		assertEquals(3, p.rob(new int[] {2, 3, 2}));
	}

	@Test
	void pickAlternating() {
		assertEquals(4, p.rob(new int[] {1, 2, 3, 1}));
	}

	@Test
	void singleHouse() {
		assertEquals(5, p.rob(new int[] {5}));
	}
}
