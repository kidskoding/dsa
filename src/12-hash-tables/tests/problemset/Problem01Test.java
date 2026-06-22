import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void firstUniqueChar_returnsFirstUniqueIndex() {
		var sut = new Problem01();
		assertEquals(2, sut.firstUniqueChar("aabcc"));
	}

	@Test
	void firstUniqueChar_allRepeat_returnsMinusOne() {
		var sut = new Problem01();
		assertEquals(-1, sut.firstUniqueChar("aabb"));
	}
}
