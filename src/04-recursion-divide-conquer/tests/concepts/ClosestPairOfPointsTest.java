import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ClosestPairOfPointsTest {

	@Test
	void distance_axisAlignedTriple_returnsHypotenuse() {
		var sut = new ClosestPairOfPoints();
		assertEquals(5.0, sut.distance(new Point(0, 0), new Point(3, 4)), 1e-9);
	}

	@Test
	void closestDistance_clusteredPoints_findsNearestPair() {
		var sut = new ClosestPairOfPoints();
		Point[] points = {
			new Point(0, 0), new Point(10, 10), new Point(1, 1), new Point(5, 5), new Point(1.2, 1.1)
		};
		assertEquals(Math.hypot(0.2, 0.1), sut.closestDistance(points), 1e-9);
	}

	@Test
	void closestDistance_twoPoints_returnsTheirDistance() {
		var sut = new ClosestPairOfPoints();
		assertEquals(
				Math.sqrt(2.0), sut.closestDistance(new Point[] {new Point(0, 0), new Point(1, 1)}), 1e-9);
	}
}
