import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem2Test {

	private final Problem2 sut = new Problem2();

	@Test
	void searchInsert_present_returnsIndex() {
		assertEquals(2, sut.searchInsert(new int[] {1, 3, 5, 6}, 5));
	}

	@Test
	void searchInsert_gap_returnsInsertionPoint() {
		assertEquals(1, sut.searchInsert(new int[] {1, 3, 5, 6}, 2));
	}

	@Test
	void searchInsert_beyondEnd_returnsLength() {
		assertEquals(4, sut.searchInsert(new int[] {1, 3, 5, 6}, 7));
	}
}
