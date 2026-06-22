import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem23Test {

	@Test
	void medianChecksum_example() {
		assertEquals(13L, Problem23.medianChecksum(new int[] {2, 1, 5, 7, 2, 0, 5}));
	}

	@Test
	void medianChecksum_twoElements() {
		assertEquals(4L, Problem23.medianChecksum(new int[] {3, 1}));
	}
}
