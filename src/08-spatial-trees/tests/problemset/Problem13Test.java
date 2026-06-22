import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void closestPair_findsTheNearestTwo() {
		var sut = new Problem13();
		var points =
				List.of(new Point2D(0, 0), new Point2D(10, 10), new Point2D(0, 1), new Point2D(50, 50));
		Point2D[] pair = sut.closestPair(points);
		List<Point2D> asList = List.of(pair[0], pair[1]);
		assertTrue(asList.contains(new Point2D(0, 0)));
		assertTrue(asList.contains(new Point2D(0, 1)));
	}
}
