import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	@Test
	void classicExample() {
		assertEquals(6, Problem16.trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
	}

	@Test
	void anotherProfile() {
		assertEquals(9, Problem16.trap(new int[] {4, 2, 0, 3, 2, 5}));
	}

	@Test
	void noWaterWhenMonotonic() {
		assertEquals(0, Problem16.trap(new int[] {1, 2, 3, 4, 5}));
	}

	@Test
	void emptyTrapsNothing() {
		assertEquals(0, Problem16.trap(new int[] {}));
	}
}
