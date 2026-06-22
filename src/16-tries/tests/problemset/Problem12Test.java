import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void maxXorOfPair() {
		Problem12 p = new Problem12();
		assertEquals(28, p.maxXor(new int[] {3, 10, 5, 25, 2, 8}));
	}

	@Test
	void twoElements() {
		Problem12 p = new Problem12();
		assertEquals(7, p.maxXor(new int[] {2, 5}));
	}

	@Test
	void singleElementHasNoPair() {
		Problem12 p = new Problem12();
		assertEquals(0, p.maxXor(new int[] {42}));
	}

	@Test
	void duplicatesXorToZero() {
		Problem12 p = new Problem12();
		assertEquals(0, p.maxXor(new int[] {6, 6}));
	}
}
