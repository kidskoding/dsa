import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem18Test {

	private final Problem18 sut = new Problem18();

	@Test
	void seam_palindromic() {
		assertEquals("aba", sut.longestSeam("abacaba"));
	}

	@Test
	void seam_allSame() {
		assertEquals("aaa", sut.longestSeam("aaaa"));
	}

	@Test
	void seam_none() {
		assertEquals("", sut.longestSeam("abcd"));
	}
}
