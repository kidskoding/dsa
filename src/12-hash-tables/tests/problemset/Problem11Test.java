import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	@Test
	void numJewels_mixed() {
		var sut = new Problem11();
		assertEquals(3, sut.numJewelsInStones("aA", "aAAbbbb"));
	}

	@Test
	void numJewels_caseSensitive() {
		var sut = new Problem11();
		assertEquals(0, sut.numJewelsInStones("z", "ZZ"));
	}

	@Test
	void numJewels_all() {
		var sut = new Problem11();
		assertEquals(6, sut.numJewelsInStones("abc", "aabbcc"));
	}
}
