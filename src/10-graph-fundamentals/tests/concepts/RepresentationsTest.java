import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class RepresentationsTest {

	@Test
	void constructor_negativeVertexCount_throws() {
		assertThrows(IllegalArgumentException.class, () -> new Graph(-1, false));
	}

	@Test
	void emptyGraph_hasNoEdges() {
		var g = new Graph(3, true);
		assertEquals(3, g.vertexCount());
		assertEquals(0, g.degree(0));
		assertTrue(g.neighbors(0).isEmpty());
	}

	@Test
	void addEdge_directed_recordsSingleDirection() {
		var g = new Graph(2, true);
		g.addEdge(0, 1);
		assertEquals(List.of(1), g.neighbors(0));
		assertEquals(0, g.degree(1));
		assertTrue(g.isDirected());
	}

	@Test
	void addUndirectedEdge_recordsBothDirections() {
		var g = new Graph(2, false);
		g.addUndirectedEdge(0, 1);
		assertEquals(1, g.degree(0));
		assertEquals(1, g.degree(1));
		assertFalse(g.isDirected());
	}

	@Test
	void addEdge_outOfRange_throws() {
		var g = new Graph(2, true);
		assertThrows(IndexOutOfBoundsException.class, () -> g.addEdge(0, 5));
	}

	@Test
	void neighbors_outOfRange_throws() {
		var g = new Graph(1, true);
		assertThrows(IndexOutOfBoundsException.class, () -> g.neighbors(3));
	}

	@Test
	void fromEdgeList_buildsExpectedDegrees() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}}, false);
		assertEquals(1, g.degree(0));
		assertEquals(2, g.degree(1));
		assertEquals(1, g.degree(2));
	}

	@Test
	void toAdjacencyMatrix_reflectsEdges() {
		var g = Representations.fromEdgeList(2, new int[][] {{0, 1}}, true);
		boolean[][] m = Representations.toAdjacencyMatrix(g);
		assertTrue(m[0][1]);
		assertFalse(m[1][0]);
	}
}
