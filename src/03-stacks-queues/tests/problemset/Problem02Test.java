import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void singleNumber() {
		assertEquals(42, Problem02.evalRpn(new String[] {"42"}));
	}

	@Test
	void basicAddition() {
		assertEquals(9, Problem02.evalRpn(new String[] {"2", "1", "+", "3", "*"}));
	}

	@Test
	void divisionTruncatesTowardZero() {
		assertEquals(6, Problem02.evalRpn(new String[] {"4", "13", "5", "/", "+"}));
	}

	@Test
	void longerExpression() {
		assertEquals(
				22,
				Problem02.evalRpn(
						new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
	}
}
