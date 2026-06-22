import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem19Test {

	private final Problem19 sut = new Problem19();

	@Test
	void faction_transitiveAndLoner() {
		assertArrayEquals(
			new boolean[] {true, false},
			sut.sameFaction(4, new int[][] {{0, 1}, {1, 2}}, new int[][] {{0, 2}, {0, 3}}));
	}

	@Test
	void faction_noAlliances() {
		assertArrayEquals(
			new boolean[] {false, true},
			sut.sameFaction(3, new int[][] {}, new int[][] {{0, 1}, {2, 2}}));
	}

	@Test
	void faction_twoGroups() {
		assertArrayEquals(
			new boolean[] {true, false},
			sut.sameFaction(5, new int[][] {{0, 1}, {2, 3}, {3, 4}}, new int[][] {{2, 4}, {1, 3}}));
	}
}
