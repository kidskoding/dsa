import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SparseTableTest {

	@Test
	void rangeMin_returnsMinimumOverRange() {
		var sut = new SparseTable(new int[] {5, 2, 8, 1, 9, 3});
		assertEquals(1L, sut.rangeMin(0, 5));
		assertEquals(2L, sut.rangeMin(0, 2));
	}

	@Test
	void rangeMin_singleElement() {
		var sut = new SparseTable(new int[] {4, 7, 2});
		assertEquals(7L, sut.rangeMin(1, 1));
	}

	@Test
	void rangeMin_subrangeExcludesGlobalMin() {
		var sut = new SparseTable(new int[] {5, 2, 8, 1, 9, 3});
		assertEquals(8L, sut.rangeMin(2, 2));
	}
}
