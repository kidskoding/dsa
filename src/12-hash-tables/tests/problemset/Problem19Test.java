import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem19Test {

	@Test
	void countPairs_three() {
		var sut = new Problem19();
		assertEquals(3, sut.countPairs(new int[] {1, 5, 3, 4, 2}, 2));
	}

	@Test
	void countPairs_withDuplicates() {
		var sut = new Problem19();
		assertEquals(4, sut.countPairs(new int[] {8, 12, 16, 4, 0, 0}, 4));
	}

	@Test
	void countPairs_none() {
		var sut = new Problem19();
		assertEquals(0, sut.countPairs(new int[] {1, 2, 3}, 5));
	}
}
