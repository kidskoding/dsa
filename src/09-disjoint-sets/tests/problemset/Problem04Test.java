import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void largestSetSize_mergesGrowGroup() {
		var sut = new Problem04();
		assertEquals(3, sut.largestSetSize(5, new int[][] {{0, 1}, {1, 2}, {3, 4}}));
	}

	@Test
	void largestSetSize_noUnions_isOne() {
		var sut = new Problem04();
		assertEquals(1, sut.largestSetSize(4, new int[][] {}));
	}
}
