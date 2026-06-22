import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void mostFrequent_returnsTopCount() {
		var sut = new Problem05();
		assertEquals(2, sut.mostFrequent(new int[] {1, 2, 2, 3, 3, 2}));
	}

	@Test
	void mostFrequent_tieBrokenBySmallest() {
		var sut = new Problem05();
		assertEquals(1, sut.mostFrequent(new int[] {1, 1, 2, 2}));
	}
}
