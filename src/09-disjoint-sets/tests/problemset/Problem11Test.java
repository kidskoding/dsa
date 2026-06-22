import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	private final Problem11 sut = new Problem11();

	@Test
	void removeStones_oneGroup_fiveRemovable() {
		assertEquals(
			5,
			sut.removeStones(new int[][] {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}}));
	}

	@Test
	void removeStones_twoGroups_threeRemovable() {
		assertEquals(
			3, sut.removeStones(new int[][] {{0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2}}));
	}

	@Test
	void removeStones_singleStone_none() {
		assertEquals(0, sut.removeStones(new int[][] {{0, 0}}));
	}
}
