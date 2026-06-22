import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void prefixFunction_classicPattern_returnsBorders() {
		assertArrayEquals(new int[] {0, 0, 1, 2, 3, 0, 1}, new Problem02().prefixFunction("ababaca"));
	}

	@Test
	void prefixFunction_allEqual_returnsIncreasing() {
		assertArrayEquals(new int[] {0, 1, 2, 3}, new Problem02().prefixFunction("aaaa"));
	}

	@Test
	void prefixFunction_singleChar_returnsZero() {
		assertArrayEquals(new int[] {0}, new Problem02().prefixFunction("a"));
	}
}
