import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void heapsort_sortsAscending() {
		int[] array = {5, 3, 8, 1, 9, 2, 7};
		Problem03.heapsort(array);
		assertArrayEquals(new int[] {1, 2, 3, 5, 7, 8, 9}, array);
	}

	@Test
	void heapsort_emptyAndSingle() {
		int[] empty = {};
		Problem03.heapsort(empty);
		assertArrayEquals(new int[] {}, empty);

		int[] single = {7};
		Problem03.heapsort(single);
		assertArrayEquals(new int[] {7}, single);
	}

	@Test
	void heapsort_withDuplicates() {
		int[] array = {4, 1, 4, 1, 4};
		Problem03.heapsort(array);
		assertArrayEquals(new int[] {1, 1, 4, 4, 4}, array);
	}

	@Test
	void heapsort_reverseSorted() {
		int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		Problem03.heapsort(array);
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, array);
	}
}
