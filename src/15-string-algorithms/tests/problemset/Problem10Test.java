import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem10Test {

	private final Problem10 sut = new Problem10();

	@Test
	void anagrams_two() {
		assertEquals(List.of(0, 6), sut.findAnagrams("cbaebabacd", "abc"));
	}

	@Test
	void anagrams_overlapping() {
		assertEquals(List.of(0, 1, 2), sut.findAnagrams("abab", "ab"));
	}

	@Test
	void anagrams_none() {
		assertEquals(List.of(), sut.findAnagrams("af", "be"));
	}
}
