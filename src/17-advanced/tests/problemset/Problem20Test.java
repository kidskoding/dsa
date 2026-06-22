import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem20Test {

	private final Problem20 sut = new Problem20();

	@Test
	void rangeDistinct_basic() {
		int[] codes = {1, 1, 2, 1, 3};
		int[][] q = {{0, 1}, {0, 4}, {2, 4}};
		assertArrayEquals(new int[] {1, 3, 3}, sut.rangeDistinct(codes, q));
	}

	@Test
	void rangeDistinct_alternating() {
		int[] codes = {4, 7, 4, 7};
		int[][] q = {{0, 3}, {1, 2}};
		assertArrayEquals(new int[] {2, 2}, sut.rangeDistinct(codes, q));
	}
}
