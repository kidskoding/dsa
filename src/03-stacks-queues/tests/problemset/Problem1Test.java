import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem1Test {

	@Test
	void matchedBrackets() {
		assertTrue(Problem1.isValid("()[]{}"));
		assertTrue(Problem1.isValid("{[]}"));
	}

	@Test
	void mismatchedOrder() {
		assertFalse(Problem1.isValid("([)]"));
	}
}
