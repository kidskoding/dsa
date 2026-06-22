import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.Test;

class Problem6Test {

	private final Problem6 sut = new Problem6();

	private static int[][] sortByDistance(int[][] pts) {
		int[][] copy = Arrays.stream(pts).map(int[]::clone).toArray(int[][]::new);
		Arrays.sort(copy, Comparator.comparingInt((int[] p) -> p[0] * p[0] + p[1] * p[1])
				.thenComparingInt(p -> p[0]).thenComparingInt(p -> p[1]));
		return copy;
	}

	@Test
	void pickOne() {
		int[][] out = sut.kClosest(new int[][] {{1, 3}, {-2, 2}}, 1);
		assertEquals(1, out.length);
		assertEquals(-2, out[0][0]);
		assertEquals(2, out[0][1]);
	}

	@Test
	void pickTwoIgnoringOrder() {
		int[][] out = sut.kClosest(new int[][] {{3, 3}, {5, -1}, {-2, 4}}, 2);
		assertEquals(2, out.length);
		int[][] sorted = sortByDistance(out);
		assertEquals(3, sorted[0][0]);
		assertEquals(3, sorted[0][1]);
		assertEquals(-2, sorted[1][0]);
		assertEquals(4, sorted[1][1]);
	}

	@Test
	void kZero() {
		assertEquals(0, sut.kClosest(new int[][] {{1, 1}}, 0).length);
	}
}
