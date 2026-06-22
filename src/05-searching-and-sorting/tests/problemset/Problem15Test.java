import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	private final Problem15 sut = new Problem15();

	@Test
	void maximumGap_unsorted_findsLargestGap() {
		// sorted: 1 3 6 9 -> gaps 2,3,3 -> max 3
		assertEquals(3, sut.maximumGap(new int[] {3, 6, 9, 1}));
	}

	@Test
	void maximumGap_singleElement_isZero() {
		assertEquals(0, sut.maximumGap(new int[] {7}));
	}

	@Test
	void maximumGap_empty_isZero() {
		assertEquals(0, sut.maximumGap(new int[] {}));
	}

	@Test
	void maximumGap_twoElements_isTheirDifference() {
		assertEquals(10, sut.maximumGap(new int[] {1, 11}));
	}
}
