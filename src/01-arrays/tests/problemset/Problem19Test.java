import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem19Test {

	@Test
	void pivotIndex_basic() {
		var sut = new Problem19();
		assertEquals(3, sut.pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
	}

	@Test
	void pivotIndex_none() {
		var sut = new Problem19();
		assertEquals(-1, sut.pivotIndex(new int[] {1, 2, 3}));
	}

	@Test
	void pivotIndex_firstIndex() {
		var sut = new Problem19();
		assertEquals(0, sut.pivotIndex(new int[] {2, 1, -1}));
	}
}
