import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	@Test
	void longestBorder_classic_returnsBorder() {
		assertEquals("aba", new Problem11().longestBorder("abacaba"));
	}

	@Test
	void longestBorder_noBorder_returnsEmpty() {
		assertEquals("", new Problem11().longestBorder("abcde"));
	}

	@Test
	void longestBorder_repeated_returnsLongest() {
		assertEquals("abab", new Problem11().longestBorder("ababab"));
	}
}
