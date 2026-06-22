import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void rotateLeft_byTwo_shiftsLeft() {
		var sut = new Problem02();
		assertArrayEquals(new int[] {3, 4, 5, 1, 2}, sut.rotateLeft(new int[] {1, 2, 3, 4, 5}, 2));
	}

	@Test
	void rotateLeft_kExceedsLength_usesModulo() {
		var sut = new Problem02();
		assertArrayEquals(new int[] {2, 3, 1}, sut.rotateLeft(new int[] {1, 2, 3}, 7));
	}
}
