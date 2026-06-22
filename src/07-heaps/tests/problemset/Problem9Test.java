import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem9Test {

	@Test
	void topKFrequent_byDescendingFrequency() {
		assertArrayEquals(new int[] {1, 2}, Problem9.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2));
	}

	@Test
	void topKFrequent_single() {
		assertArrayEquals(new int[] {1}, Problem9.topKFrequent(new int[] {1}, 1));
	}
}
