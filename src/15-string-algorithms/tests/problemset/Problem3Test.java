import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem3Test {

	private final Problem3 sut = new Problem3();

	@Test
	void z_allSame() {
		assertArrayEquals(new int[] {0, 4, 3, 2, 1}, sut.zArray("aaaaa"));
	}

	@Test
	void z_palindromic() {
		assertArrayEquals(new int[] {0, 0, 1, 0, 3, 0, 1}, sut.zArray("abacaba"));
	}

	@Test
	void z_single() {
		assertArrayEquals(new int[] {0}, sut.zArray("x"));
	}
}
