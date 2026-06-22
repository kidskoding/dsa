import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void countOccurrences_overlapping_countsEach() {
		assertEquals(4, new Problem04().countOccurrences("aaaaaa", "aaa"));
	}

	@Test
	void countOccurrences_disjoint_countsAll() {
		assertEquals(3, new Problem04().countOccurrences("ABABDABACDABABCABAB", "ABAB"));
	}

	@Test
	void countOccurrences_noMatch_returnsZero() {
		assertEquals(0, new Problem04().countOccurrences("abcde", "xyz"));
	}
}
