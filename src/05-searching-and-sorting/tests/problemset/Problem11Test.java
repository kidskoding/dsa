import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	private final Problem11 sut = new Problem11();

	@Test
	void findMin_rotated() {
		assertEquals(1, sut.findMin(new int[] {3, 4, 5, 1, 2}));
	}

	@Test
	void findMin_rotatedWithZero() {
		assertEquals(0, sut.findMin(new int[] {4, 5, 6, 7, 0, 1, 2}));
	}

	@Test
	void findMin_noRotation() {
		assertEquals(11, sut.findMin(new int[] {11, 13, 15, 17}));
	}
}
