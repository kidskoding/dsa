import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem3Test {

	private final Problem3 p = new Problem3();

	@Test
	void smallStreet() {
		assertEquals(4, p.rob(new int[] {1, 2, 3, 1}));
	}

	@Test
	void longerStreet() {
		assertEquals(12, p.rob(new int[] {2, 7, 9, 3, 1}));
	}

	@Test
	void singleHouse() {
		assertEquals(5, p.rob(new int[] {5}));
	}
}
