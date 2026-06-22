import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	private final Problem13 sut = new Problem13();

	@Test
	void merge_overlapping() {
		int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
		assertArrayEquals(expected, sut.merge(new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
	}

	@Test
	void merge_touching() {
		assertArrayEquals(new int[][] {{1, 5}}, sut.merge(new int[][] {{1, 4}, {4, 5}}));
	}

	@Test
	void merge_contained() {
		assertArrayEquals(new int[][] {{1, 4}}, sut.merge(new int[][] {{1, 4}, {2, 3}}));
	}
}
