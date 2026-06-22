import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void removeKDigits_dropsLargestLeadingDigits() {
		var sut = new Problem05();
		assertEquals("1219", sut.removeKDigits("1432219", 3));
	}

	@Test
	void removeKDigits_stripsLeadingZeros() {
		var sut = new Problem05();
		assertEquals("200", sut.removeKDigits("10200", 1));
	}

	@Test
	void removeKDigits_removesAll_returnsZero() {
		var sut = new Problem05();
		assertEquals("0", sut.removeKDigits("10", 2));
	}
}
