import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	private final Problem16 sut = new Problem16();

	@Test
	void bottleneckRating() {
		int[][] r = {{0, 1, 3}, {1, 2, 1}, {2, 3, 4}, {0, 3, 2}};
		assertEquals(3, sut.minPlowRating(4, r));
	}

	@Test
	void equalDepths() {
		int[][] r = {{0, 1, 5}, {1, 2, 5}};
		assertEquals(5, sut.minPlowRating(3, r));
	}

	@Test
	void disconnectedReturnsMinusOne() {
		int[][] r = {{0, 1, 2}};
		assertEquals(-1, sut.minPlowRating(3, r));
	}
}
