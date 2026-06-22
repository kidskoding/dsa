import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void squaredDistance_threeFourFive_is25() {
		var sut = new Problem01();
		assertEquals(25.0, sut.squaredDistance(new Point2D(0, 0), new Point2D(3, 4)), 1e-9);
	}

	@Test
	void squaredDistance_samePoint_isZero() {
		var sut = new Problem01();
		assertEquals(0.0, sut.squaredDistance(new Point2D(7, -2), new Point2D(7, -2)), 1e-9);
	}
}
