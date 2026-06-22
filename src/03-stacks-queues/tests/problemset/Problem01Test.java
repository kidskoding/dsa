import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void emptyStringIsValid() {
		assertTrue(Problem01.isValid(""));
	}

	@Test
	void simpleMatchedPairs() {
		assertTrue(Problem01.isValid("()"));
		assertTrue(Problem01.isValid("()[]{}"));
		assertTrue(Problem01.isValid("{[()]}"));
	}

	@Test
	void mismatchedOrUnclosed() {
		assertFalse(Problem01.isValid("(]"));
		assertFalse(Problem01.isValid("([)]"));
		assertFalse(Problem01.isValid("("));
		assertFalse(Problem01.isValid(")"));
	}
}
