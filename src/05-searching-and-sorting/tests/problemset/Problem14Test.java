import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	private final Problem14 sut = new Problem14();

	@Test
	void topKFrequent_twoMost() {
		assertArrayEquals(new int[] {1, 2}, sut.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2));
	}

	@Test
	void topKFrequent_single() {
		assertArrayEquals(new int[] {1}, sut.topKFrequent(new int[] {1}, 1));
	}

	@Test
	void topKFrequent_descendingByCount() {
		assertArrayEquals(new int[] {4, 5}, sut.topKFrequent(new int[] {4, 4, 4, 5, 5, 6}, 2));
	}
}
