import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem22Test {

	private final Problem22 sut = new Problem22();

	private int[][] toArray(List<int[]> result) {
		return result.toArray(new int[0][]);
	}

	@Test
	void getSkyline_classic() {
		int[][] buildings = {
			{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8},
		};
		int[][] expected = {
			{2, 10}, {3, 15}, {7, 12}, {12, 0}, {15, 10}, {20, 8}, {24, 0},
		};
		assertEquals(java.util.Arrays.deepToString(expected),
				java.util.Arrays.deepToString(toArray(sut.getSkyline(buildings))));
	}

	@Test
	void getSkyline_adjacentEqualHeight() {
		int[][] buildings = {{0, 2, 3}, {2, 5, 3}};
		int[][] expected = {{0, 3}, {5, 0}};
		assertEquals(java.util.Arrays.deepToString(expected),
				java.util.Arrays.deepToString(toArray(sut.getSkyline(buildings))));
	}

	@Test
	void getSkyline_single() {
		int[][] buildings = {{1, 5, 11}};
		int[][] expected = {{1, 11}, {5, 0}};
		assertEquals(java.util.Arrays.deepToString(expected),
				java.util.Arrays.deepToString(toArray(sut.getSkyline(buildings))));
	}
}
