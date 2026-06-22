import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem7Test {

	@Test
	void lastStoneWeight_example() {
		assertEquals(1, Problem7.lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1}));
	}

	@Test
	void lastStoneWeight_equalPairAnnihilates() {
		assertEquals(0, Problem7.lastStoneWeight(new int[] {3, 3}));
	}
}
