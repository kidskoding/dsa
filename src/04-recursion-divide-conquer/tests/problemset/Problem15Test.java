import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	private final Problem15 sut = new Problem15();

	@Test
	void majorityElement_short() {
		assertEquals(3, sut.majorityElement(new int[] {3, 2, 3}));
	}

	@Test
	void majorityElement_longer() {
		assertEquals(2, sut.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}));
	}

	@Test
	void majorityElement_singleton() {
		assertEquals(7, sut.majorityElement(new int[] {7}));
	}
}
