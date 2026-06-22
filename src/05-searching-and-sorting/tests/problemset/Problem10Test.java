import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem10Test {

	private final Problem10 sut = new Problem10();

	@Test
	void search_present_returnsIndex() {
		assertEquals(4, sut.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
	}

	@Test
	void search_absent_returnsMinusOne() {
		assertEquals(-1, sut.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3));
	}

	@Test
	void search_singleMiss() {
		assertEquals(-1, sut.search(new int[] {1}, 0));
	}
}
