import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem22Test {

	private final Problem22 sut = new Problem22();

	@Test
	void skyline_basic() {
		int[][] buildings = {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
		int[][] expected = {{2, 10}, {3, 15}, {7, 12}, {12, 0}, {15, 10}, {20, 8}, {24, 0}};
		assertArrayEquals(expected, sut.skyline(buildings));
	}

	@Test
	void skyline_singleBuilding() {
		int[][] buildings = {{1, 3, 4}};
		int[][] expected = {{1, 4}, {3, 0}};
		assertArrayEquals(expected, sut.skyline(buildings));
	}
}
