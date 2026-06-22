import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	private final Problem16 sut = new Problem16();

	@Test
	void findRelativeRanks_descending() {
		assertArrayEquals(
				new String[] {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"},
				sut.findRelativeRanks(new int[] {5, 4, 3, 2, 1}));
	}

	@Test
	void findRelativeRanks_shuffled() {
		assertArrayEquals(
				new String[] {"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"},
				sut.findRelativeRanks(new int[] {10, 3, 8, 9, 4}));
	}

	@Test
	void findRelativeRanks_single() {
		assertArrayEquals(new String[] {"Gold Medal"}, sut.findRelativeRanks(new int[] {1}));
	}
}
