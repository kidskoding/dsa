import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem17Test {

	private final Problem17 sut = new Problem17();

	@Test
	void lock_oneDelete() {
		assertTrue(sut.opens("deeee"));
	}

	@Test
	void lock_alreadyPalindrome() {
		assertTrue(sut.opens("racecar"));
	}

	@Test
	void lock_false() {
		assertFalse(sut.opens("abcdef"));
	}
}
