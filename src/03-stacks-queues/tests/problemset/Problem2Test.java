import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem2Test {

	@Test
	void basicExpression() {
		assertEquals(9, Problem2.evalRPN(new String[] {"2", "1", "+", "3", "*"}));
	}

	@Test
	void divisionTruncates() {
		assertEquals(6, Problem2.evalRPN(new String[] {"4", "13", "5", "/", "+"}));
	}
}
