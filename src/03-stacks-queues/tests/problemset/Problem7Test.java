import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem7Test {

	@Test
	void cancelAndCombine() {
		assertEquals(30, Problem7.calPoints(new String[] {"5", "2", "C", "D", "+"}));
	}

	@Test
	void longerSequence() {
		assertEquals(
				27,
				Problem7.calPoints(new String[] {"5", "-2", "4", "C", "D", "9", "+", "+"}));
	}
}
