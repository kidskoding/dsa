import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem28Test {

	private final Problem28 p = new Problem28();

	@Test
	void differenceOne() {
		assertEquals(1, p.minDifference(new int[] {1, 6, 11, 5}));
	}

	@Test
	void evenSplit() {
		assertEquals(0, p.minDifference(new int[] {3, 1, 4, 2, 2}));
	}

	@Test
	void singlePart() {
		assertEquals(10, p.minDifference(new int[] {10}));
	}
}
