import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem18Test {

	@Test
	void countPeaks_basic() {
		var sut = new Problem18();
		assertEquals(2, sut.countPeaks(new int[] {1, 3, 2, 4, 1}));
	}

	@Test
	void countPeaks_monotonic() {
		var sut = new Problem18();
		assertEquals(0, sut.countPeaks(new int[] {1, 2, 3}));
	}

	@Test
	void countPeaks_oscillating() {
		var sut = new Problem18();
		assertEquals(1, sut.countPeaks(new int[] {5, 1, 5, 1, 5}));
	}
}
