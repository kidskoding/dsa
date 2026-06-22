import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem18Test {

	@Test
	void loneOdd_first() {
		var sut = new Problem18();
		assertEquals(4, sut.loneOddCode(new int[] {4, 1, 2, 1, 2}));
	}

	@Test
	void loneOdd_last() {
		var sut = new Problem18();
		assertEquals(9, sut.loneOddCode(new int[] {7, 7, 9}));
	}

	@Test
	void loneOdd_single() {
		var sut = new Problem18();
		assertEquals(5, sut.loneOddCode(new int[] {5}));
	}
}
