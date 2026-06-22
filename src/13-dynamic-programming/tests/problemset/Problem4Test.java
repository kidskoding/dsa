import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem4Test {

	private final Problem4 p = new Problem4();

	@Test
	void threeBySeven() {
		assertEquals(28, p.uniquePaths(3, 7));
	}

	@Test
	void threeByTwo() {
		assertEquals(3, p.uniquePaths(3, 2));
	}

	@Test
	void singleCell() {
		assertEquals(1, p.uniquePaths(1, 1));
	}
}
