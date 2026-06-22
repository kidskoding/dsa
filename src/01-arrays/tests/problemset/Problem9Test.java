import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem9Test {

	@Test
	void longestThawStreak_basic() {
		var sut = new Problem9();
		assertEquals(3, sut.longestThawStreak(new int[] {5, 3, 2, 4, 1}));
	}

	@Test
	void longestThawStreak_increasing() {
		var sut = new Problem9();
		assertEquals(1, sut.longestThawStreak(new int[] {1, 2, 3}));
	}

	@Test
	void longestThawStreak_empty() {
		var sut = new Problem9();
		assertEquals(0, sut.longestThawStreak(new int[] {}));
	}
}
