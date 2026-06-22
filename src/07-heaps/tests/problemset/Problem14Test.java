import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void sortNearlySorted_k3() {
		int[] array = {6, 5, 3, 2, 8, 10, 9};
		Problem14.sortNearlySorted(array, 3);
		assertArrayEquals(new int[] {2, 3, 5, 6, 8, 9, 10}, array);
	}

	@Test
	void sortNearlySorted_k1() {
		int[] array = {2, 1, 4, 3, 6, 5};
		Problem14.sortNearlySorted(array, 1);
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, array);
	}

	@Test
	void sortNearlySorted_singleElement() {
		int[] array = {42};
		Problem14.sortNearlySorted(array, 1);
		assertArrayEquals(new int[] {42}, array);
	}
}
