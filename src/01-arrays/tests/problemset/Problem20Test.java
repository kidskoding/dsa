import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem20Test {

	@Test
	void reportRepair_aoc() {
		var sut = new Problem20();
		assertEquals(514579L, sut.reportRepair(new int[] {1721, 979, 366, 299, 675, 1456}, 2020));
	}

	@Test
	void reportRepair_small() {
		var sut = new Problem20();
		assertEquals(600L, sut.reportRepair(new int[] {10, 20, 30}, 50));
	}

	@Test
	void reportRepair_duplicates() {
		var sut = new Problem20();
		assertEquals(1020100L, sut.reportRepair(new int[] {1010, 1010, 5}, 2020));
	}
}
