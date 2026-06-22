import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void minMoves_threeDisks_returnsSeven() {
		assertEquals(7L, new Problem13().minMoves(3));
	}

	@Test
	void minMoves_zeroDisks_returnsZero() {
		assertEquals(0L, new Problem13().minMoves(0));
	}
}
