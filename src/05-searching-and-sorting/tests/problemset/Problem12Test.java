import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	private final Problem12 sut = new Problem12();

	@Test
	void search_targetInRotatedTail_returnsIndex() {
		assertEquals(4, sut.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
	}

	@Test
	void search_targetInRotatedHead_returnsIndex() {
		assertEquals(0, sut.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 4));
	}

	@Test
	void search_absent_returnsMinusOne() {
		assertEquals(-1, sut.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3));
	}

	@Test
	void search_notRotated_returnsIndex() {
		assertEquals(2, sut.search(new int[] {1, 2, 3, 4, 5}, 3));
	}

	@Test
	void search_singleElement_returnsIndex() {
		assertEquals(0, sut.search(new int[] {1}, 1));
	}
}
