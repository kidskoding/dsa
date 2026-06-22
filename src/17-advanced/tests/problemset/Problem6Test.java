import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem6Test {

	private final Problem6 sut = new Problem6();

	@Test
	void kthSmallestAfterOps_select() {
		int[][] ops = {{0, 5}, {0, 1}, {0, 3}, {2, 2}};
		assertArrayEquals(new int[] {3}, sut.kthSmallestAfterOps(ops));
	}

	@Test
	void kthSmallestAfterOps_deleteThenSelect() {
		int[][] ops = {{0, 4}, {0, 8}, {1, 4}, {2, 1}};
		assertArrayEquals(new int[] {8}, sut.kthSmallestAfterOps(ops));
	}
}
