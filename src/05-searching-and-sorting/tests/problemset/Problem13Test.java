import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	private static final double EPS = 1e-9;

	private final Problem13 sut = new Problem13();

	@Test
	void median_oddTotal_isMiddleValue() {
		assertEquals(2.0, sut.findMedianSortedArrays(new int[] {1, 3}, new int[] {2}), EPS);
	}

	@Test
	void median_evenTotal_isAverageOfMiddle() {
		assertEquals(2.5, sut.findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4}), EPS);
	}

	@Test
	void median_oneEmpty_usesOther() {
		assertEquals(2.0, sut.findMedianSortedArrays(new int[] {}, new int[] {1, 2, 3}), EPS);
	}

	@Test
	void median_disjointRanges_isCorrect() {
		assertEquals(5.5, sut.findMedianSortedArrays(new int[] {1, 2, 3}, new int[] {8, 9, 10}), EPS);
	}
}
