import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LongestCommonSubsequenceTest {

	private final LongestCommonSubsequence lcs = new LongestCommonSubsequence();

	@Test
	void classicInstance() {
		assertEquals(4, lcs.length("ABCBDAB", "BDCAB"));
	}

	@Test
	void identicalStrings() {
		assertEquals(5, lcs.length("HELLO", "HELLO"));
	}

	@Test
	void noCommonCharacters() {
		assertEquals(0, lcs.length("ABC", "XYZ"));
	}

	@Test
	void emptyInputs() {
		assertEquals(0, lcs.length("", "ABC"));
		assertEquals(0, lcs.length("ABC", ""));
		assertEquals(0, lcs.length("", ""));
	}

	@Test
	void reconstructHasCorrectLength() {
		String result = lcs.reconstruct("ABCBDAB", "BDCAB");
		assertEquals(4, result.length());
	}

	@Test
	void reconstructIsSubsequenceOfBoth() {
		String a = "AGGTAB";
		String b = "GXTXAYB";
		String result = lcs.reconstruct(a, b);
		assertTrue(isSubsequence(result, a));
		assertTrue(isSubsequence(result, b));
	}

	private static boolean isSubsequence(String s, String t) {
		int i = 0;
		for (int j = 0; j < t.length() && i < s.length(); j++) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
			}
		}
		return i == s.length();
	}
}
