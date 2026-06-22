import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem10Test {

	private final Problem10 p = new Problem10();

	@Test
	void twelve() {
		assertEquals(3, p.numSquares(12));
	}

	@Test
	void thirteen() {
		assertEquals(2, p.numSquares(13));
	}

	@Test
	void one() {
		assertEquals(1, p.numSquares(1));
	}
}
