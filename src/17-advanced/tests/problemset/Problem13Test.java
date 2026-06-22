import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	private final Problem13 sut = new Problem13();

	@Test
	void countReversePairs_basic() {
		assertEquals(2L, sut.countReversePairs(new int[] {1, 3, 2, 3, 1}));
	}

	@Test
	void countReversePairs_another() {
		assertEquals(3L, sut.countReversePairs(new int[] {2, 4, 3, 5, 1}));
	}

	@Test
	void countReversePairs_none() {
		assertEquals(0L, sut.countReversePairs(new int[] {1, 2, 3, 4, 5}));
	}
}
