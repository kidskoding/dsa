import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void simpleAddition() {
		assertEquals(2, Problem13.calculate("1 + 1"));
	}

	@Test
	void mixedWithSpaces() {
		assertEquals(3, Problem13.calculate(" 2-1 + 2 "));
	}

	@Test
	void nestedParentheses() {
		assertEquals(23, Problem13.calculate("(1+(4+5+2)-3)+(6+8)"));
	}

	@Test
	void singleNumber() {
		assertEquals(42, Problem13.calculate("42"));
	}
}
