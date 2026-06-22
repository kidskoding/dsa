import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	private final Problem15 sut = new Problem15();

	@Test
	void hIndex_mixed() {
		assertEquals(3, sut.hIndex(new int[] {3, 0, 6, 1, 5}));
	}

	@Test
	void hIndex_small() {
		assertEquals(1, sut.hIndex(new int[] {1, 3, 1}));
	}

	@Test
	void hIndex_uncited() {
		assertEquals(0, sut.hIndex(new int[] {0}));
	}
}
