import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void commonPrefixOfSeveralKeys() {
		Problem05 p = new Problem05();
		p.insert("flower");
		p.insert("flow");
		p.insert("flight");
		assertEquals("fl", p.longestCommonPrefix());
	}

	@Test
	void noCommonPrefix() {
		Problem05 p = new Problem05();
		p.insert("dog");
		p.insert("cat");
		assertEquals("", p.longestCommonPrefix());
	}

	@Test
	void singleKeyIsItsOwnPrefix() {
		Problem05 p = new Problem05();
		p.insert("alone");
		assertEquals("alone", p.longestCommonPrefix());
	}

	@Test
	void prefixKeyLimitsCommonPrefix() {
		Problem05 p = new Problem05();
		p.insert("ab");
		p.insert("abc");
		assertEquals("ab", p.longestCommonPrefix());
	}
}
