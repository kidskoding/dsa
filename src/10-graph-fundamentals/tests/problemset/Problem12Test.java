import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	private final Problem12 sut = new Problem12();

	@Test
	void center_two() {
		assertEquals(2, sut.findCenter(new int[][] {{1, 2}, {2, 3}, {4, 2}}));
	}

	@Test
	void center_one() {
		assertEquals(1, sut.findCenter(new int[][] {{1, 2}, {5, 1}, {1, 3}, {1, 4}}));
	}

	@Test
	void center_three() {
		assertEquals(3, sut.findCenter(new int[][] {{3, 1}, {3, 2}}));
	}
}
