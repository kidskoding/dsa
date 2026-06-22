import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void rangeMinima_answersEachQuery() {
		var sut = new Problem04();
		int[] values = {5, 2, 8, 1, 9, 3};
		int[][] queries = {{0, 2}, {3, 5}, {0, 5}};
		assertArrayEquals(new int[] {2, 1, 1}, sut.rangeMinima(values, queries));
	}
}
