import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem20Test {

	private final Problem20 sut = new Problem20();

	@Test
	void merge_overlapping() {
		assertArrayEquals(
				new int[][] {{1, 6}, {8, 10}, {15, 18}},
				sut.merge(new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
	}

	@Test
	void merge_touching() {
		assertArrayEquals(new int[][] {{1, 5}}, sut.merge(new int[][] {{1, 4}, {4, 5}}));
	}

	@Test
	void merge_unordered() {
		assertArrayEquals(new int[][] {{0, 4}}, sut.merge(new int[][] {{1, 4}, {0, 4}}));
	}
}
