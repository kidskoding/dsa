import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem6Test {

	private final Problem6 sut = new Problem6();

	@Test
	void strStr_found() {
		assertEquals(0, sut.strStr("sadbutsad", "sad"));
	}

	@Test
	void strStr_notFound() {
		assertEquals(-1, sut.strStr("leetcode", "leeto"));
	}

	@Test
	void strStr_emptyNeedle() {
		assertEquals(0, sut.strStr("hello", ""));
	}
}
