import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void productExceptSelf_basic() {
		var sut = new Problem13();
		assertArrayEquals(new int[] {24, 12, 8, 6}, sut.productExceptSelf(new int[] {1, 2, 3, 4}));
	}

	@Test
	void productExceptSelf_withZero() {
		var sut = new Problem13();
		assertArrayEquals(
				new int[] {0, 0, 9, 0, 0}, sut.productExceptSelf(new int[] {-1, 1, 0, -3, 3}));
	}

	@Test
	void productExceptSelf_pair() {
		var sut = new Problem13();
		assertArrayEquals(new int[] {3, 2}, sut.productExceptSelf(new int[] {2, 3}));
	}
}
