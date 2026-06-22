import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem1Test {

	private final Problem1 sut = new Problem1();

	@Test
	void threeFourFive_is25() {
		assertEquals(25L, sut.squaredDistance(new int[] {0, 0}, new int[] {3, 4}));
	}

	@Test
	void samePoint_isZero() {
		assertEquals(0L, sut.squaredDistance(new int[] {7, -2}, new int[] {7, -2}));
	}

	@Test
	void negativeCoords() {
		assertEquals(25L, sut.squaredDistance(new int[] {-1, -1}, new int[] {2, 3}));
	}
}
