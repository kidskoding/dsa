import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void pointsInRange_returnsOnlyInside() {
		var sut = new Problem05();
		var points =
				List.of(new Point2D(1, 1), new Point2D(5, 5), new Point2D(-3, 2), new Point2D(4, 4));
		List<Point2D> found = sut.pointsInRange(points, 0, 0, 4, 4);
		assertEquals(2, found.size());
		assertTrue(found.contains(new Point2D(1, 1)));
		assertTrue(found.contains(new Point2D(4, 4)));
	}
}
