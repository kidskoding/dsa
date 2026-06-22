import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class QuadTreeTest {

	@Test
	void newTree_isEmpty() {
		var tree = new QuadTree(0, 0, 10, 2);
		assertTrue(tree.isEmpty());
		assertEquals(0, tree.size());
	}

	@Test
	void insert_inBounds_succeeds() {
		var tree = new QuadTree(0, 0, 10, 2);
		assertTrue(tree.insert(new Point2D(1, 1)));
		assertTrue(tree.insert(new Point2D(-3, 4)));
		assertEquals(2, tree.size());
	}

	@Test
	void insert_outOfBounds_isRejected() {
		var tree = new QuadTree(0, 0, 10, 2);
		assertFalse(tree.insert(new Point2D(100, 100)));
		assertEquals(0, tree.size());
	}

	@Test
	void insert_overflowingBucket_subdividesAndKeepsAll() {
		var tree = new QuadTree(0, 0, 10, 1);
		tree.insert(new Point2D(1, 1));
		tree.insert(new Point2D(2, 2));
		tree.insert(new Point2D(-4, -4));
		assertEquals(3, tree.size());
	}

	@Test
	void rangeQuery_returnsPointsInsideRectangle() {
		var tree = new QuadTree(0, 0, 10, 2);
		tree.insert(new Point2D(1, 1));
		tree.insert(new Point2D(5, 5));
		tree.insert(new Point2D(-8, -8));
		List<Point2D> found = tree.rangeQuery(0, 0, 6, 6);
		assertEquals(2, found.size());
		assertTrue(found.contains(new Point2D(1, 1)));
		assertTrue(found.contains(new Point2D(5, 5)));
	}

	@Test
	void nearestNeighbor_emptyTree_returnsNull() {
		var tree = new QuadTree(0, 0, 10, 2);
		assertNull(tree.nearestNeighbor(new Point2D(0, 0)));
	}

	@Test
	void nearestNeighbor_returnsClosestPoint() {
		var tree = new QuadTree(0, 0, 10, 2);
		tree.insert(new Point2D(1, 1));
		tree.insert(new Point2D(5, 5));
		tree.insert(new Point2D(-8, -8));
		assertEquals(new Point2D(5, 5), tree.nearestNeighbor(new Point2D(6, 6)));
	}
}
