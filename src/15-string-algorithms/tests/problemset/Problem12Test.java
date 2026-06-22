import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem12Test {

	private final Problem12 sut = new Problem12();

	@Test
	void palindrome_already() {
		assertTrue(sut.validPalindrome("aba"));
	}

	@Test
	void palindrome_oneDelete() {
		assertTrue(sut.validPalindrome("abca"));
	}

	@Test
	void palindrome_false() {
		assertFalse(sut.validPalindrome("abc"));
	}
}
