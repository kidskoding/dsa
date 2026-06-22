import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void intersects_overlappingRectangles_isTrue() {
		var sut = new Problem03();
		assertTrue(sut.intersects(0, 0, 4, 4, 2, 2, 6, 6));
	}

	@Test
	void intersects_touchingEdges_isTrue() {
		var sut = new Problem03();
		assertTrue(sut.intersects(0, 0, 2, 2, 2, 0, 4, 2));
	}

	@Test
	void intersects_disjointRectangles_isFalse() {
		var sut = new Problem03();
		assertFalse(sut.intersects(0, 0, 1, 1, 3, 3, 4, 4));
	}
}
