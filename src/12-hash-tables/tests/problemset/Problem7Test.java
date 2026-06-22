import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem7Test {

	@Test
	void isAnagram_true() {
		var sut = new Problem7();
		assertTrue(sut.isAnagram("anagram", "nagaram"));
	}

	@Test
	void isAnagram_false() {
		var sut = new Problem7();
		assertFalse(sut.isAnagram("rat", "car"));
	}

	@Test
	void isAnagram_differentLengths() {
		var sut = new Problem7();
		assertFalse(sut.isAnagram("ab", "a"));
	}
}
