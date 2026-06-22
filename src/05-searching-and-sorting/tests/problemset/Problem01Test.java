import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem01Test {

	private final Problem01 sut = new Problem01();

	@Test
	void searchRange_runOfDuplicates_returnsFirstAndLast() {
		assertArrayEquals(new int[] {3, 5}, sut.searchRange(new int[] {1, 2, 2, 8, 8, 8, 9}, 8));
	}

	@Test
	void searchRange_singleOccurrence_returnsSameIndexTwice() {
		assertArrayEquals(new int[] {1, 1}, sut.searchRange(new int[] {1, 2, 3}, 2));
	}

	@Test
	void searchRange_absent_returnsMinusOnes() {
		assertArrayEquals(new int[] {-1, -1}, sut.searchRange(new int[] {1, 2, 3}, 7));
	}

	@Test
	void searchRange_emptyArray_returnsMinusOnes() {
		assertArrayEquals(new int[] {-1, -1}, sut.searchRange(new int[] {}, 1));
	}
}
