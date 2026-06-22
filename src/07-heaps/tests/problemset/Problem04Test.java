import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void kSmallest_returnsAscending() {
		int[] array = {7, 2, 9, 1, 5, 3};
		assertArrayEquals(new int[] {1, 2, 3}, Problem04.kSmallest(array, 3));
	}

	@Test
	void kSmallest_kZero_returnsEmpty() {
		assertArrayEquals(new int[] {}, Problem04.kSmallest(new int[] {4, 2, 6}, 0));
	}

	@Test
	void kSmallest_kEqualsLength_returnsAllSorted() {
		int[] array = {3, 1, 2};
		assertArrayEquals(new int[] {1, 2, 3}, Problem04.kSmallest(array, 3));
	}

	@Test
	void kSmallest_withDuplicates() {
		int[] array = {5, 1, 1, 1, 9};
		assertArrayEquals(new int[] {1, 1, 1}, Problem04.kSmallest(array, 3));
	}
}
