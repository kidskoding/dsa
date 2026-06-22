import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void sortNearlySorted_k3() {
		int[] in = {6, 5, 3, 2, 8, 10, 9};
		assertArrayEquals(new int[] {2, 3, 5, 6, 8, 9, 10}, Problem12.sortNearlySorted(in, 3));
	}

	@Test
	void sortNearlySorted_k1() {
		assertArrayEquals(new int[] {1, 2, 3}, Problem12.sortNearlySorted(new int[] {2, 1, 3}, 1));
	}
}
