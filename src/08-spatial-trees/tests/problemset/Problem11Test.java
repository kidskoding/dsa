import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem11Test {

	@Test
	void build_emptyList_returnsNull() {
		var sut = new Problem11();
		assertNull(sut.build(List.of()));
	}

	@Test
	void build_sevenPoints_isBalanced() {
		var sut = new Problem11();
		var points =
				List.of(
						new Point2D(2, 3),
						new Point2D(5, 4),
						new Point2D(9, 6),
						new Point2D(4, 7),
						new Point2D(8, 1),
						new Point2D(7, 2),
						new Point2D(1, 1));
		Problem11.BalancedKdNode root = sut.build(points);
		// A balanced tree over 7 nodes has height 2.
		assertEquals(2, sut.height(root));
	}
}
