import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SkipListTest {

	@Test
	void newList_isEmpty() {
		var list = new SkipList<Integer>();
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
	}

	@Test
	void insert_thenContains() {
		var list = new SkipList<Integer>();
		assertTrue(list.insert(5));
		assertTrue(list.contains(5));
		assertFalse(list.contains(6));
		assertEquals(1, list.size());
	}

	@Test
	void insert_duplicate_isIgnored() {
		var list = new SkipList<Integer>();
		assertTrue(list.insert(3));
		assertFalse(list.insert(3));
		assertEquals(1, list.size());
	}

	@Test
	void remove_existingAndMissing() {
		var list = new SkipList<Integer>();
		list.insert(1);
		list.insert(2);
		assertTrue(list.remove(1));
		assertFalse(list.contains(1));
		assertFalse(list.remove(99));
		assertEquals(1, list.size());
	}

	@Test
	void singleElement_insertThenRemove_isEmpty() {
		var list = new SkipList<Integer>();
		list.insert(7);
		assertTrue(list.remove(7));
		assertTrue(list.isEmpty());
	}

	@Test
	void largeInput_allFoundAfterInsertion() {
		var list = new SkipList<Integer>();
		for (int i = 0; i < 1000; i++) {
			list.insert(i);
		}
		assertEquals(1000, list.size());
		for (int i = 0; i < 1000; i++) {
			assertTrue(list.contains(i));
		}
		assertFalse(list.contains(1000));
	}
}
