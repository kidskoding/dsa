import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

import org.junit.jupiter.api.Test;

class Problem26Test {

	private final Problem26 sut = new Problem26();

	@Test
	void sevenEdgeGraph() {
		int[][] e = {{0, 1, 1}, {1, 2, 1}, {2, 3, 2}, {0, 3, 2}, {0, 4, 3}, {3, 4, 3}, {1, 4, 6}};
		assertEquals(List.of(List.of(0, 1), List.of(2, 3, 4, 5)), sut.findCriticalAndPseudoCriticalEdges(5, e));
	}

	@Test
	void allInterchangeable() {
		int[][] e = {{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {0, 3, 1}};
		assertEquals(List.of(List.of(), List.of(0, 1, 2, 3)), sut.findCriticalAndPseudoCriticalEdges(4, e));
	}

	@Test
	void bothCritical() {
		int[][] e = {{0, 1, 1}, {1, 2, 2}};
		assertEquals(List.of(List.of(0, 1), List.of()), sut.findCriticalAndPseudoCriticalEdges(3, e));
	}
}
