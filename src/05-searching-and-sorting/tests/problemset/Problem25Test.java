import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem25Test {

	private final Problem25 sut = new Problem25();

	@Test
	void findMedian_oddTotal() {
		assertEquals(2.0, sut.findMedianSortedArrays(new int[] {1, 3}, new int[] {2}), 1e-9);
	}

	@Test
	void findMedian_evenTotal() {
		assertEquals(2.5, sut.findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4}), 1e-9);
	}

	@Test
	void findMedian_oneEmpty() {
		assertEquals(1.0, sut.findMedianSortedArrays(new int[] {}, new int[] {1}), 1e-9);
	}
}
