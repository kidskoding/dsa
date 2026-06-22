import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem5Test {

	@Test
	void parent_binaryHeap() {
		assertEquals(2, Problem5.parent(5, 2));
	}

	@Test
	void parent_rootHasNone() {
		assertEquals(-1, Problem5.parent(0, 4));
	}

	@Test
	void child_ternaryHeap() {
		assertEquals(7, Problem5.child(2, 0, 3));
	}
}
