import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Point2DTest {

	@Test
	void squaredDistanceTo_axisAligned_returnsSquare() {
		var a = new Point2D(0, 0);
		var b = new Point2D(3, 4);
		assertEquals(25.0, a.squaredDistanceTo(b), 1e-9);
	}

	@Test
	void squaredDistanceTo_samePoint_isZero() {
		var a = new Point2D(2.5, -1.0);
		assertEquals(0.0, a.squaredDistanceTo(a), 1e-9);
	}
}
