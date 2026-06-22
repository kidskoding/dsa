import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.Test;

class Problem8Test {

	@Test
	void kClosest_singleClosest() {
		int[][] result = Problem8.kClosest(new int[][] {{1, 3}, {-2, 2}}, 1);
		assertEquals(1, result.length);
		assertArrayEquals(new int[] {-2, 2}, result[0]);
	}

	@Test
	void kClosest_twoOfThree() {
		int[][] result = Problem8.kClosest(new int[][] {{3, 3}, {5, -1}, {-2, 4}}, 2);
		Arrays.sort(result, Comparator.comparingInt((int[] p) -> p[0]).thenComparingInt(p -> p[1]));
		assertArrayEquals(new int[][] {{-2, 4}, {3, 3}}, result);
	}
}
