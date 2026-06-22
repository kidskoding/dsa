import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem4Test {

	private final Problem4 sut = new Problem4();

	@Test
	void northEast() {
		assertEquals("NE", sut.quadrant(new int[] {0, 0}, new int[] {3, 5}));
	}

	@Test
	void northWest() {
		assertEquals("NW", sut.quadrant(new int[] {0, 0}, new int[] {-2, 4}));
	}

	@Test
	void southWest() {
		assertEquals("SW", sut.quadrant(new int[] {10, 10}, new int[] {4, 2}));
	}
}
