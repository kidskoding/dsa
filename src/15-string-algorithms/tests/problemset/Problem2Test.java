import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem2Test {

	private final Problem2 sut = new Problem2();

	@Test
	void prefix_mixed() {
		assertArrayEquals(new int[] {0, 0, 1, 2, 3, 0, 1}, sut.prefixFunction("ababaca"));
	}

	@Test
	void prefix_allSame() {
		assertArrayEquals(new int[] {0, 1, 2, 3}, sut.prefixFunction("aaaa"));
	}

	@Test
	void prefix_noBorder() {
		assertArrayEquals(new int[] {0, 0, 0, 1, 2, 3, 0}, sut.prefixFunction("abcabcd"));
	}
}
