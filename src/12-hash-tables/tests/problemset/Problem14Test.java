import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void topK_two() {
		var sut = new Problem14();
		assertArrayEquals(new int[] {1, 2}, sut.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2));
	}

	@Test
	void topK_single() {
		var sut = new Problem14();
		assertArrayEquals(new int[] {1}, sut.topKFrequent(new int[] {1}, 1));
	}

	@Test
	void topK_tieBySmaller() {
		var sut = new Problem14();
		assertArrayEquals(new int[] {4, 5}, sut.topKFrequent(new int[] {4, 4, 5, 5, 6}, 2));
	}
}
