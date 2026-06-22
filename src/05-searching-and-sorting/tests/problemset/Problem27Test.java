import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem27Test {

	private final Problem27 sut = new Problem27();

	@Test
	void rankLeaderboard_tieByName() {
		assertArrayEquals(
				new String[] {"bob", "carol", "amy"},
				sut.rankLeaderboard(new int[] {50, 80, 80}, new String[] {"amy", "carol", "bob"}));
	}

	@Test
	void rankLeaderboard_descendingScores() {
		assertArrayEquals(
				new String[] {"z", "y", "x"},
				sut.rankLeaderboard(new int[] {10, 20, 30}, new String[] {"x", "y", "z"}));
	}

	@Test
	void rankLeaderboard_single() {
		assertArrayEquals(new String[] {"solo"}, sut.rankLeaderboard(new int[] {5}, new String[] {"solo"}));
	}
}
