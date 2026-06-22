import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem9Test {

	private final Problem9 sut = new Problem9();

	@Test
	void prefix_singleChar() {
		assertEquals("l", sut.longestPrefix("level"));
	}

	@Test
	void prefix_long() {
		assertEquals("abab", sut.longestPrefix("ababab"));
	}

	@Test
	void prefix_none() {
		assertEquals("", sut.longestPrefix("abcd"));
	}
}
