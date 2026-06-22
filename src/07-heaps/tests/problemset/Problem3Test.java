import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem3Test {

	@Test
	void heapsort_sortsAscending() {
		int[] array = {5, 1, 4, 2, 8};
		Problem3.heapsort(array);
		assertArrayEquals(new int[] {1, 2, 4, 5, 8}, array);
	}

	@Test
	void heapsort_handlesDuplicates() {
		int[] array = {3, 3, 1, 2, 3};
		Problem3.heapsort(array);
		assertArrayEquals(new int[] {1, 2, 3, 3, 3}, array);
	}
}
