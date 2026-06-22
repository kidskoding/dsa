import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem21Test {

	@Test
	void nestedDoubles() {
		assertEquals(1, Problem21.scoreOfParentheses("()"));
		assertEquals(2, Problem21.scoreOfParentheses("(())"));
	}

	@Test
	void adjacentPairs() {
		assertEquals(2, Problem21.scoreOfParentheses("()()"));
	}
}
