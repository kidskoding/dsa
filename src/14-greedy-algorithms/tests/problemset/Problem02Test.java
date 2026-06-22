import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem02Test {

	private final Problem02 sut = new Problem02();

	@Test
	void minPoints_twoPointsCoverThree() {
		assertEquals(2, sut.minPoints(new int[][] {{1, 3}, {2, 5}, {4, 6}}));
	}

	@Test
	void minPoints_chainNeedsTwo() {
		assertEquals(2, sut.minPoints(new int[][] {{1, 2}, {2, 3}, {3, 4}}));
	}

	@Test
	void minPoints_singleInterval() {
		assertEquals(1, sut.minPoints(new int[][] {{1, 10}}));
	}
}
