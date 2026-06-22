import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem19Test {

	private final Problem19 sut = new Problem19();

	@Test
	void schedule_chain() {
		assertArrayEquals(new int[] {0, 1, 2}, sut.schedule(3, new int[][] {{0, 1}, {1, 2}}));
	}

	@Test
	void schedule_smallestIdFirst() {
		assertArrayEquals(
			new int[] {0, 1, 2, 3}, sut.schedule(4, new int[][] {{0, 2}, {1, 2}, {2, 3}}));
	}

	@Test
	void schedule_cycleEmpty() {
		assertArrayEquals(new int[] {}, sut.schedule(2, new int[][] {{0, 1}, {1, 0}}));
	}
}
