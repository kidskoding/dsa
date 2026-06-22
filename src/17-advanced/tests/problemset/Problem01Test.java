import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void kthSmallestAfterOps_answersSelectQueries() {
		var sut = new Problem01();
		// insert 5, insert 1, insert 3, select 1 -> 1, select 2 -> 3
		int[][] ops = {{0, 5}, {0, 1}, {0, 3}, {2, 1}, {2, 2}};
		assertArrayEquals(new int[] {1, 3}, sut.kthSmallestAfterOps(ops));
	}
}
