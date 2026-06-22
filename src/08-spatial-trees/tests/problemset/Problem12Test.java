import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void kNearest_returnsTwoClosestInOrder() {
		var sut = new Problem12();
		var points =
				List.of(new Point2D(0, 0), new Point2D(1, 1), new Point2D(5, 5), new Point2D(10, 10));
		List<Point2D> result = sut.kNearest(points, new Point2D(0, 0), 2);
		assertEquals(List.of(new Point2D(0, 0), new Point2D(1, 1)), result);
	}

	@Test
	void kNearest_zeroK_returnsEmpty() {
		var sut = new Problem12();
		var points = List.of(new Point2D(0, 0), new Point2D(1, 1));
		assertEquals(List.of(), sut.kNearest(points, new Point2D(0, 0), 0));
	}
}
