import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem8Test {

	private final Problem8 sut = new Problem8();

	@Test
	void repeated_true() {
		assertTrue(sut.repeatedSubstringPattern("abab"));
	}

	@Test
	void repeated_false() {
		assertFalse(sut.repeatedSubstringPattern("aba"));
	}

	@Test
	void repeated_manyCopies() {
		assertTrue(sut.repeatedSubstringPattern("abcabcabcabc"));
	}
}
