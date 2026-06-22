import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem6Test {

	private final Problem6 sut = new Problem6();

	@Test
	void isPowerOfTwo_sixteen() {
		assertTrue(sut.isPowerOfTwo(16));
	}

	@Test
	void isPowerOfTwo_twelve() {
		assertFalse(sut.isPowerOfTwo(12));
	}

	@Test
	void isPowerOfTwo_one() {
		assertTrue(sut.isPowerOfTwo(1));
	}
}
