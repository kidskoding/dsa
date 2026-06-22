import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void sumOfDigits_multiDigit_returnsSum() {
		assertEquals(15, new Problem01().sumOfDigits(12345));
	}

	@Test
	void sumOfDigits_singleDigit_returnsItself() {
		assertEquals(0, new Problem01().sumOfDigits(0));
		assertEquals(7, new Problem01().sumOfDigits(7));
	}
}
