import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem04Test {

	private final Problem04 p = new Problem04();

	@Test
	void classicInstance() {
		assertEquals(28L, p.countPaths(3, 7));
	}

	@Test
	void square() {
		assertEquals(6L, p.countPaths(3, 3));
	}

	@Test
	void singleRow() {
		assertEquals(1L, p.countPaths(1, 5));
	}

	@Test
	void singleCell() {
		assertEquals(1L, p.countPaths(1, 1));
	}
}
