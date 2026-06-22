import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem22Test {

	private final Problem22 sut = new Problem22();

	@Test
	void minEatingSpeed_basic() {
		assertEquals(4, sut.minEatingSpeed(new int[] {3, 6, 7, 11}, 8));
	}

	@Test
	void minEatingSpeed_tightHours() {
		assertEquals(30, sut.minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 5));
	}

	@Test
	void minEatingSpeed_extraHour() {
		assertEquals(23, sut.minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 6));
	}
}
