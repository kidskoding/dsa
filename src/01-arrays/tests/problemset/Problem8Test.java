import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem8Test {

	@Test
	void majorityElement_small() {
		var sut = new Problem8();
		assertEquals(3, sut.majorityElement(new int[] {3, 2, 3}));
	}

	@Test
	void majorityElement_larger() {
		var sut = new Problem8();
		assertEquals(2, sut.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}));
	}

	@Test
	void majorityElement_single() {
		var sut = new Problem8();
		assertEquals(7, sut.majorityElement(new int[] {7}));
	}
}
