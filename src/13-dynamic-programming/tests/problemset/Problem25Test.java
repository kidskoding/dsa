import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import org.junit.jupiter.api.Test;

class Problem25Test {

	private final Problem25 p = new Problem25();

	@Test
	void eitherValidThree() {
		assertTrue(Set.of("bab", "aba").contains(p.longestPalindrome("babad")));
	}

	@Test
	void innerPair() {
		assertEquals("bb", p.longestPalindrome("cbbd"));
	}

	@Test
	void single() {
		assertEquals("a", p.longestPalindrome("a"));
	}
}
