import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DynamicArrayTest {

	@Test
	void isEmpty_newArray_returnsTrue() {
		var list = new DynamicArray<Integer>();
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
	}

	@Test
	void add_singleElement_growsSizeToOne() {
		var list = new DynamicArray<Integer>();
		list.add(42);
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
		assertEquals(42, list.get(0));
	}

	@Test
	void add_beyondInitialCapacity_growsCapacity() {
		var list = new DynamicArray<Integer>(2);
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(3, list.size());
		assertTrue(list.capacity() >= 3);
	}

	@Test
	void add_largeNumberOfElements_preservesOrder() {
		var list = new DynamicArray<Integer>();
		for (int i = 0; i < 1000; i++) {
			list.add(i);
		}
		assertEquals(1000, list.size());
		assertEquals(0, list.get(0));
		assertEquals(999, list.get(999));
	}

	@Test
	void add_duplicateValues_keepsAllOccurrences() {
		var list = new DynamicArray<Integer>();
		list.add(7);
		list.add(7);
		list.add(7);
		assertEquals(3, list.size());
		assertEquals(7, list.get(1));
	}

	@Test
	void get_indexOutOfRange_throws() {
		var list = new DynamicArray<Integer>();
		list.add(1);
		assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
	}

	@Test
	void set_existingIndex_returnsPreviousValue() {
		var list = new DynamicArray<Integer>();
		list.add(10);
		assertEquals(10, list.set(0, 20));
		assertEquals(20, list.get(0));
	}

	@Test
	void insert_atFront_shiftsExistingRight() {
		var list = new DynamicArray<Integer>();
		list.add(2);
		list.add(3);
		list.insert(0, 1);
		assertEquals(3, list.size());
		assertEquals(1, list.get(0));
		assertEquals(2, list.get(1));
		assertEquals(3, list.get(2));
	}

	@Test
	void insert_indexOutOfRange_throws() {
		var list = new DynamicArray<Integer>();
		assertThrows(IndexOutOfBoundsException.class, () -> list.insert(1, 5));
	}

	@Test
	void remove_middleElement_shiftsLaterLeft() {
		var list = new DynamicArray<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(2, list.remove(1));
		assertEquals(2, list.size());
		assertEquals(1, list.get(0));
		assertEquals(3, list.get(1));
	}

	@Test
	void remove_onlyElement_leavesArrayEmpty() {
		var list = new DynamicArray<Integer>();
		list.add(99);
		assertEquals(99, list.remove(0));
		assertTrue(list.isEmpty());
	}

	@Test
	void remove_indexOutOfRange_throws() {
		var list = new DynamicArray<Integer>();
		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
	}
}
