import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	@Test
	void productExceptSelf_noZeros_returnsProducts() {
		var sut = new Problem11();
		assertArrayEquals(new int[] {24, 12, 8, 6}, sut.productExceptSelf(new int[] {1, 2, 3, 4}));
	}

	@Test
	void productExceptSelf_singleZero_zeroesAllButOne() {
		var sut = new Problem11();
		assertArrayEquals(new int[] {0, 0, 6, 0}, sut.productExceptSelf(new int[] {1, 2, 0, 3}));
	}
}
