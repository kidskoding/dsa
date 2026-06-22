import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem3Test {

	private final Problem3 sut = new Problem3();

	@Test
	void searchRange_run_returnsFirstAndLast() {
		assertArrayEquals(new int[] {3, 4}, sut.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8));
	}

	@Test
	void searchRange_absent_returnsMinusOnes() {
		assertArrayEquals(new int[] {-1, -1}, sut.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 6));
	}

	@Test
	void searchRange_empty_returnsMinusOnes() {
		assertArrayEquals(new int[] {-1, -1}, sut.searchRange(new int[] {}, 0));
	}
}
