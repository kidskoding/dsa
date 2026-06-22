import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	private final Problem14 sut = new Problem14();

	@Test
	void canCompleteCircuit_startsAtThree() {
		assertEquals(3, sut.canCompleteCircuit(new int[] {1, 2, 3, 4, 5}, new int[] {3, 4, 5, 1, 2}));
	}

	@Test
	void canCompleteCircuit_impossible() {
		assertEquals(-1, sut.canCompleteCircuit(new int[] {2, 3, 4}, new int[] {3, 4, 3}));
	}

	@Test
	void canCompleteCircuit_startsAtFour() {
		assertEquals(4, sut.canCompleteCircuit(new int[] {5, 1, 2, 3, 4}, new int[] {4, 4, 1, 5, 1}));
	}
}
