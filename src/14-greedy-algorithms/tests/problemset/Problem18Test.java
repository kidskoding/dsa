import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem18Test {

	private final Problem18 sut = new Problem18();

	@Test
	void numRescueBoats_oneBoat() {
		assertEquals(1, sut.numRescueBoats(new int[] {1, 2}, 3));
	}

	@Test
	void numRescueBoats_threeBoats() {
		assertEquals(3, sut.numRescueBoats(new int[] {3, 2, 2, 1}, 3));
	}

	@Test
	void numRescueBoats_eachAlone() {
		assertEquals(4, sut.numRescueBoats(new int[] {3, 5, 3, 4}, 5));
	}
}
