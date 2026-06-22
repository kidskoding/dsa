import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem6Test {

	@Test
	void findKthLargest_secondLargest() {
		assertEquals(5, Problem6.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2));
	}

	@Test
	void findKthLargest_withDuplicates() {
		assertEquals(4, Problem6.findKthLargest(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
	}
}
