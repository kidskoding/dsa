import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem5Test {

	private final Problem5 sut = new Problem5();

	@Test
	void kthSmallest_secondSmallest() {
		assertEquals(2, sut.kthSmallest(new int[] {3, 2, 1, 5, 6, 4}, 2));
	}

	@Test
	void kthSmallest_withDuplicates() {
		assertEquals(3, sut.kthSmallest(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
	}

	@Test
	void kthSmallest_single() {
		assertEquals(7, sut.kthSmallest(new int[] {7}, 1));
	}
}
