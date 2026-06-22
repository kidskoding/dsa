import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem4Test {

	@Test
	void kSmallest_returnsThreeSmallestAscending() {
		assertArrayEquals(new int[] {3, 4, 7}, Problem4.kSmallest(new int[] {7, 10, 4, 3, 20, 15}, 3));
	}

	@Test
	void kSmallest_kExceedsLength() {
		assertArrayEquals(new int[] {2, 5}, Problem4.kSmallest(new int[] {5, 2}, 5));
	}
}
