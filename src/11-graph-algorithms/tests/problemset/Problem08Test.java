import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem08Test {

	private final Problem08 sut = new Problem08();

	@Test
	void prefersTwoHopPath() {
		int[][] e = {{0, 1}, {1, 2}, {0, 2}};
		double[] p = {0.5, 0.5, 0.2};
		assertEquals(0.25, sut.maxProbability(3, e, p, 0, 2), 1e-9);
	}

	@Test
	void prefersDirectEdge() {
		int[][] e = {{0, 1}, {1, 2}, {0, 2}};
		double[] p = {0.5, 0.5, 0.3};
		assertEquals(0.3, sut.maxProbability(3, e, p, 0, 2), 1e-9);
	}

	@Test
	void noPathIsZero() {
		int[][] e = {{0, 1}};
		double[] p = {0.5};
		assertEquals(0.0, sut.maxProbability(3, e, p, 0, 2), 1e-9);
	}
}
