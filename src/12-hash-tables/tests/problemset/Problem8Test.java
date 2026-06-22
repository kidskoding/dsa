import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem8Test {

	@Test
	void firstUniqChar_firstIndex() {
		var sut = new Problem8();
		assertEquals(0, sut.firstUniqChar("leetcode"));
	}

	@Test
	void firstUniqChar_laterIndex() {
		var sut = new Problem8();
		assertEquals(2, sut.firstUniqChar("loveleetcode"));
	}

	@Test
	void firstUniqChar_none() {
		var sut = new Problem8();
		assertEquals(-1, sut.firstUniqChar("aabb"));
	}
}
