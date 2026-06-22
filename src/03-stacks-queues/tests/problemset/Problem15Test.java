import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	@Test
	void singleRepetition() {
		assertEquals("aaa", Problem15.decodeString("3[a]"));
	}

	@Test
	void repetitionWithSuffix() {
		assertEquals("accaccacc", Problem15.decodeString("3[acc]"));
	}

	@Test
	void nestedRepetition() {
		assertEquals("accaccacc", Problem15.decodeString("3[a2[c]]"));
	}

	@Test
	void multipleGroups() {
		assertEquals("abcabccdcdcdef", Problem15.decodeString("2[abc]3[cd]ef"));
	}
}
