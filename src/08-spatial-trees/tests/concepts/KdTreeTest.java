import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class KdTreeTest {

	@Test
	void newTree_isEmpty() {
		var tree = new KdTree();
		assertTrue(tree.isEmpty());
		assertEquals(0, tree.size());
	}

	@Test
	void insert_thenContains_findsPoint() {
		var tree = new KdTree();
		tree.insert(new Point2D(2, 3));
		tree.insert(new Point2D(5, 4));
		assertEquals(2, tree.size());
		assertTrue(tree.contains(new Point2D(5, 4)));
		assertFalse(tree.contains(new Point2D(9, 9)));
	}

	@Test
	void insert_duplicate_isIgnored() {
		var tree = new KdTree();
		tree.insert(new Point2D(1, 1));
		tree.insert(new Point2D(1, 1));
		assertEquals(1, tree.size());
	}

	@Test
	void rangeQuery_returnsPointsInsideRectangle() {
		var tree = new KdTree();
		tree.insert(new Point2D(2, 3));
		tree.insert(new Point2D(5, 4));
		tree.insert(new Point2D(9, 6));
		tree.insert(new Point2D(4, 7));
		List<Point2D> found = tree.rangeQuery(1, 2, 6, 5);
		assertEquals(2, found.size());
		assertTrue(found.contains(new Point2D(2, 3)));
		assertTrue(found.contains(new Point2D(5, 4)));
	}

	@Test
	void nearestNeighbor_emptyTree_returnsNull() {
		var tree = new KdTree();
		assertNull(tree.nearestNeighbor(new Point2D(0, 0)));
	}

	@Test
	void nearestNeighbor_returnsClosestPoint() {
		var tree = new KdTree();
		tree.insert(new Point2D(2, 3));
		tree.insert(new Point2D(5, 4));
		tree.insert(new Point2D(9, 6));
		tree.insert(new Point2D(4, 7));
		assertEquals(new Point2D(5, 4), tree.nearestNeighbor(new Point2D(6, 5)));
	}
}
