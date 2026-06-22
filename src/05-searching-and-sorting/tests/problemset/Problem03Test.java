import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem03Test {

	private final Problem03 sut = new Problem03();

	@Test
	void kthSmallest_firstRank_isMinimum() {
		assertEquals(1, sut.kthSmallest(new int[] {7, 1, 5, 3}, 1));
	}

	@Test
	void kthSmallest_lastRank_isMaximum() {
		assertEquals(7, sut.kthSmallest(new int[] {7, 1, 5, 3}, 4));
	}

	@Test
	void kthSmallest_middleRank_isCorrect() {
		assertEquals(5, sut.kthSmallest(new int[] {7, 1, 5, 3}, 3));
	}

	@Test
	void kthSmallest_withDuplicates_isCorrect() {
		assertEquals(2, sut.kthSmallest(new int[] {2, 2, 2, 1}, 3));
	}
}
