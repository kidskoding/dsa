import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem05Test {

	private final Problem05 sut = new Problem05();

	@Test
	void removeKdigits_basic() {
		assertEquals("1219", sut.removeKdigits("1432219", 3));
	}

	@Test
	void removeKdigits_stripsLeadingZero() {
		assertEquals("200", sut.removeKdigits("10200", 1));
	}

	@Test
	void removeKdigits_emptyBecomesZero() {
		assertEquals("0", sut.removeKdigits("10", 2));
	}
}
