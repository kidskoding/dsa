import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem8Test {

	private final Problem8 sut = new Problem8();

	@Test
	void singleNonDuplicate_early() {
		assertEquals(2, sut.singleNonDuplicate(new int[] {1, 1, 2, 3, 3, 4, 4, 8, 8}));
	}

	@Test
	void singleNonDuplicate_late() {
		assertEquals(10, sut.singleNonDuplicate(new int[] {3, 3, 7, 7, 10, 11, 11}));
	}

	@Test
	void singleNonDuplicate_single() {
		assertEquals(5, sut.singleNonDuplicate(new int[] {5}));
	}
}
