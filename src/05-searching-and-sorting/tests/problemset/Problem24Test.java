import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem24Test {

	private final Problem24 sut = new Problem24();

	@Test
	void splitArray_twoParts() {
		assertEquals(18, sut.splitArray(new int[] {7, 2, 5, 10, 8}, 2));
	}

	@Test
	void splitArray_twoPartsBalanced() {
		assertEquals(9, sut.splitArray(new int[] {1, 2, 3, 4, 5}, 2));
	}

	@Test
	void splitArray_eachAlone() {
		assertEquals(4, sut.splitArray(new int[] {1, 4, 4}, 3));
	}
}
