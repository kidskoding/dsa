import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem1Test {

	private final Problem1 sut = new Problem1();

	@Test
	void search_present_returnsIndex() {
		assertEquals(4, sut.search(new int[] {-1, 0, 3, 5, 9, 12}, 9));
	}

	@Test
	void search_absent_returnsMinusOne() {
		assertEquals(-1, sut.search(new int[] {-1, 0, 3, 5, 9, 12}, 2));
	}

	@Test
	void search_single_returnsZero() {
		assertEquals(0, sut.search(new int[] {5}, 5));
	}
}
