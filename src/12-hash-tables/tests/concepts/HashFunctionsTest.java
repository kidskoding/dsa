import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class HashFunctionsTest {

	@Test
	void divisionHash_inRange() {
		var sut = new HashFunctions();
		int h = sut.divisionHash(37, 10);
		assertTrue(h >= 0 && h < 10);
		assertEquals(7, h);
	}

	@Test
	void divisionHash_negativeKey_normalizesNonNegative() {
		var sut = new HashFunctions();
		int h = sut.divisionHash(-3, 10);
		assertTrue(h >= 0 && h < 10);
		assertEquals(7, h);
	}

	@Test
	void multiplicationHash_inRange() {
		var sut = new HashFunctions();
		int h = sut.multiplicationHash(123, 16, 0.6180339887);
		assertTrue(h >= 0 && h < 16);
	}

	@Test
	void polynomialHash_emptyString_isZero() {
		var sut = new HashFunctions();
		assertEquals(0L, sut.polynomialHash("", 31, 1_000_000_007L));
	}

	@Test
	void polynomialHash_anagramsDiffer() {
		var sut = new HashFunctions();
		long ab = sut.polynomialHash("ab", 31, 1_000_000_007L);
		long ba = sut.polynomialHash("ba", 31, 1_000_000_007L);
		assertTrue(ab != ba);
	}
}
