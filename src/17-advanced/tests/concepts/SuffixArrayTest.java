import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SuffixArrayTest {

	@Test
	void build_sortsSuffixesLexicographically() {
		var sut = new SuffixArray("banana");
		// suffixes sorted: a(5), ana(3), anana(1), banana(0), na(4), nana(2)
		assertArrayEquals(new int[] {5, 3, 1, 0, 4, 2}, sut.build());
	}

	@Test
	void contains_findsSubstring() {
		var sut = new SuffixArray("mississippi");
		assertTrue(sut.contains("issi"));
		assertFalse(sut.contains("xyz"));
	}

	@Test
	void longestCommonPrefixes_hasZeroFirstEntry() {
		var sut = new SuffixArray("banana");
		int[] lcp = sut.longestCommonPrefixes();
		assertTrue(lcp.length == 6 && lcp[0] == 0);
	}
}
