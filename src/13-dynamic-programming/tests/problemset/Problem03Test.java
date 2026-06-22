import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem03Test {

	private final Problem03 p = new Problem03();

	@Test
	void classicInstance() {
		assertEquals(4, p.maxLoot(new int[] {1, 2, 3, 1}));
	}

	@Test
	void anotherInstance() {
		assertEquals(12, p.maxLoot(new int[] {2, 7, 9, 3, 1}));
	}

	@Test
	void emptyStreet() {
		assertEquals(0, p.maxLoot(new int[0]));
	}

	@Test
	void singleHouse() {
		assertEquals(5, p.maxLoot(new int[] {5}));
	}
}
