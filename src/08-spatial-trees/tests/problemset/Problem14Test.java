import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem14Test {

	private static final List<Point2D> POINTS =
			List.of(
					new Point2D(1, 1),
					new Point2D(5, 5),
					new Point2D(3, 3),
					new Point2D(8, 2),
					new Point2D(-4, 0));

	@Test
	void countInRange_countsInteriorPoints() {
		var sut = new Problem14(POINTS);
		assertEquals(2, sut.countInRange(0, 0, 4, 4));
	}

	@Test
	void countInRange_emptyRegion_isZero() {
		var sut = new Problem14(POINTS);
		assertEquals(0, sut.countInRange(100, 100, 200, 200));
	}
}
