import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem2Test {

	@Test
	void rotateLeft_basic() {
		var sut = new Problem2();
		assertArrayEquals(new int[] {3, 4, 5, 1, 2}, sut.rotateLeft(new int[] {1, 2, 3, 4, 5}, 2));
	}

	@Test
	void rotateLeft_zero() {
		var sut = new Problem2();
		assertArrayEquals(new int[] {1, 2, 3}, sut.rotateLeft(new int[] {1, 2, 3}, 0));
	}

	@Test
	void rotateLeft_kExceedsLength() {
		var sut = new Problem2();
		assertArrayEquals(new int[] {3, 4, 1, 2}, sut.rotateLeft(new int[] {1, 2, 3, 4}, 6));
	}
}
