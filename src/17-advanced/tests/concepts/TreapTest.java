import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TreapTest {

	@Test
	void contains_findsInsertedKey() {
		var sut = new Treap<Integer>();
		sut.insert(4);
		sut.insert(2);
		sut.insert(6);
		assertTrue(sut.contains(2));
		assertFalse(sut.contains(99));
	}

	@Test
	void delete_removesKey() {
		var sut = new Treap<Integer>();
		sut.insert(1);
		sut.insert(2);
		assertTrue(sut.delete(1));
		assertFalse(sut.contains(1));
	}

	@Test
	void delete_absentKey_returnsFalse() {
		var sut = new Treap<Integer>();
		sut.insert(5);
		assertFalse(sut.delete(7));
	}
}
