import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem28Test {

	private final Problem28 sut = new Problem28();

	@Test
	void mergeKWay_threeStreams() {
		assertArrayEquals(
				new int[] {1, 1, 2, 3, 4, 4, 5, 6},
				sut.mergeKWay(new int[][] {{1, 4, 5}, {1, 3, 4}, {2, 6}}));
	}

	@Test
	void mergeKWay_withEmpty() {
		assertArrayEquals(new int[] {1}, sut.mergeKWay(new int[][] {{}, {1}}));
	}

	@Test
	void mergeKWay_noStreams() {
		assertArrayEquals(new int[] {}, sut.mergeKWay(new int[][] {}));
	}
}
