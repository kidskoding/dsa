import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem06Test {

	@Test
	void isPowerOfTwo_powers_returnTrue() {
		var sut = new Problem06();
		assertTrue(sut.isPowerOfTwo(1));
		assertTrue(sut.isPowerOfTwo(1024));
	}

	@Test
	void isPowerOfTwo_nonPowers_returnFalse() {
		var sut = new Problem06();
		assertFalse(sut.isPowerOfTwo(0));
		assertFalse(sut.isPowerOfTwo(6));
	}
}
