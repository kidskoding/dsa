import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem5Test {

	private final Problem5 sut = new Problem5();

	@Test
	void count_overlapping() {
		assertEquals(3, sut.countOccurrences("abababab", "abab"));
	}

	@Test
	void count_repeated() {
		assertEquals(4, sut.countOccurrences("aaaaa", "aa"));
	}

	@Test
	void count_emptyPattern() {
		assertEquals(6, sut.countOccurrences("abcde", ""));
	}
}
