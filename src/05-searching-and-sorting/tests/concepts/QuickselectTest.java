import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class QuickselectTest {

	@Test
	void kthSmallest_unsorted_returnsCorrectOrderStatistic() {
		var qs = new Quickselect();
		int[] a = {7, 2, 9, 4, 1, 8, 3};
		assertEquals(1, qs.kthSmallest(a.clone(), 1));
		assertEquals(4, qs.kthSmallest(a.clone(), 4));
		assertEquals(9, qs.kthSmallest(a.clone(), 7));
	}

	@Test
	void kthSmallest_withDuplicates_handlesEqualKeys() {
		var qs = new Quickselect();
		int[] a = {5, 1, 5, 1, 5};
		assertEquals(1, qs.kthSmallest(a.clone(), 2));
		assertEquals(5, qs.kthSmallest(a.clone(), 3));
	}

	@Test
	void kthSmallest_outOfRange_throws() {
		var qs = new Quickselect();
		assertThrows(IllegalArgumentException.class, () -> qs.kthSmallest(new int[] {1, 2, 3}, 0));
	}

	@Test
	void kthSmallestWorstCaseLinear_matchesQuickselect() {
		var qs = new Quickselect();
		int[] a = {12, 3, 7, 9, 1, 20, 5};
		assertEquals(7, qs.kthSmallestWorstCaseLinear(a.clone(), 4));
	}
}
