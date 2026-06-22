import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem19Test {

	private final Problem19 sut = new Problem19();

	@Test
	void candy_valley() {
		assertEquals(5, sut.candy(new int[] {1, 0, 2}));
	}

	@Test
	void candy_equalNeighbors() {
		assertEquals(4, sut.candy(new int[] {1, 2, 2}));
	}

	@Test
	void candy_peak() {
		assertEquals(7, sut.candy(new int[] {1, 3, 2, 2, 1}));
	}
}
