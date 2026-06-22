import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem5Test {

	@Test
	void mostFrequent_clearWinner() {
		var sut = new Problem5();
		assertEquals(2, sut.mostFrequent(new int[] {1, 3, 3, 2, 2, 2}));
	}

	@Test
	void mostFrequent_tieSmallest() {
		var sut = new Problem5();
		assertEquals(4, sut.mostFrequent(new int[] {4, 4, 5, 5}));
	}

	@Test
	void mostFrequent_single() {
		var sut = new Problem5();
		assertEquals(9, sut.mostFrequent(new int[] {9}));
	}
}
