import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem5Test {

	private final Problem5 sut = new Problem5();

	@Test
	void someInside() {
		assertEquals(List.of(0, 2), sut.rangeQuery(new int[][] {{1, 1}, {5, 5}, {2, 3}}, new int[] {0, 0, 3, 3}));
	}

	@Test
	void onBoundary() {
		assertEquals(List.of(0, 1), sut.rangeQuery(new int[][] {{0, 0}, {3, 0}}, new int[] {0, 0, 3, 0}));
	}

	@Test
	void noneInside() {
		assertEquals(List.of(), sut.rangeQuery(new int[][] {{4, 4}}, new int[] {0, 0, 1, 1}));
	}
}
