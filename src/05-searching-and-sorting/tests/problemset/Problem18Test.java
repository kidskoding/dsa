import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem18Test {

	private final Problem18 sut = new Problem18();

	@Test
	void countInversions_some() {
		assertEquals(3L, sut.countInversions(new int[] {2, 4, 1, 3, 5}));
	}

	@Test
	void countInversions_reverseSorted() {
		assertEquals(10L, sut.countInversions(new int[] {5, 4, 3, 2, 1}));
	}

	@Test
	void countInversions_sorted() {
		assertEquals(0L, sut.countInversions(new int[] {1, 2, 3}));
	}
}
