import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem7Test {

	private final Problem7 sut = new Problem7();

	@Test
	void anagram_true() {
		assertTrue(sut.isAnagram("anagram", "nagaram"));
	}

	@Test
	void anagram_false() {
		assertFalse(sut.isAnagram("rat", "car"));
	}

	@Test
	void anagram_differentLength() {
		assertFalse(sut.isAnagram("ab", "a"));
	}
}
