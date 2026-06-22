import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem20Test {

	private final Problem20 sut = new Problem20();

	@Test
	void findMedianSortedArrays_oddTotal() {
		assertEquals(2.0, sut.findMedianSortedArrays(new int[] {1, 3}, new int[] {2}), 1e-5);
	}

	@Test
	void findMedianSortedArrays_evenTotal() {
		assertEquals(2.5, sut.findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4}), 1e-5);
	}

	@Test
	void findMedianSortedArrays_oneEmpty() {
		assertEquals(1.0, sut.findMedianSortedArrays(new int[] {}, new int[] {1}), 1e-5);
	}
}
