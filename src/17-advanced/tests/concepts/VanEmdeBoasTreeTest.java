import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class VanEmdeBoasTreeTest {

	@Test
	void member_reflectsInsertions() {
		var sut = new VanEmdeBoasTree(16);
		sut.insert(3);
		sut.insert(9);
		assertTrue(sut.member(3));
		assertFalse(sut.member(4));
	}

	@Test
	void successor_returnsNextLarger() {
		var sut = new VanEmdeBoasTree(16);
		sut.insert(2);
		sut.insert(5);
		sut.insert(11);
		assertEquals(5, sut.successor(2));
		assertEquals(VanEmdeBoasTree.NIL, sut.successor(11));
	}

	@Test
	void predecessor_returnsPrevSmaller() {
		var sut = new VanEmdeBoasTree(16);
		sut.insert(2);
		sut.insert(5);
		assertEquals(2, sut.predecessor(5));
		assertEquals(VanEmdeBoasTree.NIL, sut.predecessor(2));
	}
}
