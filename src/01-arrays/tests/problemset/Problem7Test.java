import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem7Test {

	@Test
	void moveZeroes_basic() {
		var sut = new Problem7();
		assertArrayEquals(new int[] {1, 3, 12, 0, 0}, sut.moveZeroes(new int[] {0, 1, 0, 3, 12}));
	}

	@Test
	void moveZeroes_leadingZeroes() {
		var sut = new Problem7();
		assertArrayEquals(new int[] {1, 0, 0}, sut.moveZeroes(new int[] {0, 0, 1}));
	}

	@Test
	void moveZeroes_noZeroes() {
		var sut = new Problem7();
		assertArrayEquals(new int[] {1, 2, 3}, sut.moveZeroes(new int[] {1, 2, 3}));
	}
}
