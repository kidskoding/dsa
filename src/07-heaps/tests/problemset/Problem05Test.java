import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void binaryHeapArithmetic() {
		// d = 2: child(0,0)=1, child(0,1)=2, parent(1)=0, parent(2)=0.
		assertEquals(1, Problem05.child(0, 0, 2));
		assertEquals(2, Problem05.child(0, 1, 2));
		assertEquals(0, Problem05.parent(1, 2));
		assertEquals(0, Problem05.parent(2, 2));
	}

	@Test
	void ternaryHeapArithmetic() {
		// d = 3: children of 0 are 1,2,3; parent of each is 0.
		assertEquals(1, Problem05.child(0, 0, 3));
		assertEquals(3, Problem05.child(0, 2, 3));
		assertEquals(0, Problem05.parent(3, 3));
		assertEquals(1, Problem05.parent(4, 3));
	}
}
