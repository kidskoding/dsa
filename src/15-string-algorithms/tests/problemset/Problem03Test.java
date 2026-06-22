import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void zArray_classicString_returnsExpected() {
		assertArrayEquals(
				new int[] {0, 1, 0, 0, 4, 1, 0, 0, 0, 8, 1, 0, 0, 5, 1, 0, 0, 1, 0},
				new Problem03().zArray("aabxaabxcaabxaabxay"));
	}

	@Test
	void zArray_allEqual_countsRemaining() {
		assertArrayEquals(new int[] {0, 3, 2, 1}, new Problem03().zArray("aaaa"));
	}

	@Test
	void zArray_singleChar_returnsZero() {
		assertArrayEquals(new int[] {0}, new Problem03().zArray("a"));
	}
}
