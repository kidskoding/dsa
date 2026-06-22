import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem23Test {

	@Test
	void distinctRun_three() {
		var sut = new Problem23();
		assertEquals(3, sut.longestDistinctRun(new int[] {1, 2, 3, 2, 5}));
	}

	@Test
	void distinctRun_allSame() {
		var sut = new Problem23();
		assertEquals(1, sut.longestDistinctRun(new int[] {7, 7, 7}));
	}

	@Test
	void distinctRun_allDistinct() {
		var sut = new Problem23();
		assertEquals(4, sut.longestDistinctRun(new int[] {1, 2, 3, 4}));
	}
}
