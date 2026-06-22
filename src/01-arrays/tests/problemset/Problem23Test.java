import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem23Test {

	@Test
	void drops_basic() {
		var sut = new Problem23();
		assertEquals(3, sut.drops(new int[] {2, 3, 1, 5}, 5));
	}

	@Test
	void drops_allFitOnce() {
		var sut = new Problem23();
		assertEquals(1, sut.drops(new int[] {1, 1, 1}, 5));
	}

	@Test
	void drops_eachAlone() {
		var sut = new Problem23();
		assertEquals(3, sut.drops(new int[] {4, 4, 4}, 4));
	}
}
