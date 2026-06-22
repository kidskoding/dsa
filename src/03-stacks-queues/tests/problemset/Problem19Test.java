import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem19Test {

	@Test
	void smallestRemoval() {
		assertEquals("1219", Problem19.removeKdigits("1432219", 3));
	}

	@Test
	void stripsLeadingZero() {
		assertEquals("200", Problem19.removeKdigits("10200", 1));
		assertEquals("0", Problem19.removeKdigits("10", 2));
	}
}
