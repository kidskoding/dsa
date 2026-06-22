import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	private final Problem13 p = new Problem13();

	@Test
	void twoWays() {
		assertEquals(2, p.numDecodings("12"));
	}

	@Test
	void threeWays() {
		assertEquals(3, p.numDecodings("226"));
	}

	@Test
	void leadingZero() {
		assertEquals(0, p.numDecodings("06"));
	}
}
