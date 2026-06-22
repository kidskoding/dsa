import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem9Test {

	private final Problem9 sut = new Problem9();

	@Test
	void findPeakElement_singlePeak() {
		assertEquals(2, sut.findPeakElement(new int[] {1, 2, 3, 1}));
	}

	@Test
	void findPeakElement_anyValidPeakAccepted() {
		int idx = sut.findPeakElement(new int[] {1, 2, 1, 3, 5, 6, 4});
		assertTrue(idx == 1 || idx == 5);
	}

	@Test
	void findPeakElement_single() {
		assertEquals(0, sut.findPeakElement(new int[] {1}));
	}
}
