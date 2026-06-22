import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	private final Problem13 sut = new Problem13();

	@Test
	void findKthLargest_secondLargest() {
		assertEquals(5, sut.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2));
	}

	@Test
	void findKthLargest_withDuplicates() {
		assertEquals(4, sut.findKthLargest(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
	}

	@Test
	void findKthLargest_single() {
		assertEquals(1, sut.findKthLargest(new int[] {1}, 1));
	}
}
