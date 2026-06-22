import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	private final Problem16 sut = new Problem16();

	@Test
	void tile_threeCopies() {
		assertEquals(3, sut.tileLength("abcabcabc"));
	}

	@Test
	void tile_twoCopies() {
		assertEquals(2, sut.tileLength("ababab"));
	}

	@Test
	void tile_noProperTile() {
		assertEquals(5, sut.tileLength("abcab"));
	}
}
