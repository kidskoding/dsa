import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem1Test {

	private final Problem1 sut = new Problem1();

	@Test
	void sumOfDigits_multipleDigits() {
		assertEquals(15, sut.sumOfDigits(12345));
	}

	@Test
	void sumOfDigits_zero() {
		assertEquals(0, sut.sumOfDigits(0));
	}

	@Test
	void sumOfDigits_singleDigit() {
		assertEquals(9, sut.sumOfDigits(9));
	}
}
