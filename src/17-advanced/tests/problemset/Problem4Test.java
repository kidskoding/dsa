import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem4Test {

	private final Problem4 sut = new Problem4();

	@Test
	void compress_basic() {
		assertArrayEquals(new int[] {3, 0, 1, 0, 2}, sut.compress(new int[] {40, 10, 20, 10, 30}));
	}

	@Test
	void compress_withNegatives() {
		assertArrayEquals(new int[] {0, 1, 0, 2}, sut.compress(new int[] {-2, 7, -2, 100}));
	}
}
