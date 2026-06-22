import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem21Test {

	private final Problem21 sut = new Problem21();

	@Test
	void closestSpacing_findsNearestPair() {
		Point[] stations = {
			new Point(0, 0), new Point(5, 5), new Point(1, 1), new Point(9, 2),
		};
		assertEquals(Math.sqrt(2), sut.closestSpacing(stations), 1e-9);
	}

	@Test
	void closestSpacing_twoPoints() {
		Point[] stations = {new Point(0, 0), new Point(3, 4)};
		assertEquals(5.0, sut.closestSpacing(stations), 1e-9);
	}

	@Test
	void closestSpacing_verticalPair() {
		Point[] stations = {
			new Point(2, 2), new Point(2, 5), new Point(2, 2.5), new Point(8, 8),
		};
		assertEquals(0.5, sut.closestSpacing(stations), 1e-9);
	}
}
