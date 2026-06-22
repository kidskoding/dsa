import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {

	@Test
	void newList_isEmpty() {
		var list = new SinglyLinkedList<Integer>();
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
	}

	@Test
	void addFirst_prependsAndGrows() {
		var list = new SinglyLinkedList<Integer>();
		list.addFirst(2);
		list.addFirst(1);
		assertFalse(list.isEmpty());
		assertEquals(2, list.size());
		assertEquals(1, list.get(0));
		assertEquals(2, list.get(1));
	}

	@Test
	void addLast_appendsInOrder() {
		var list = new SinglyLinkedList<String>();
		list.addLast("a");
		list.addLast("b");
		assertEquals("a", list.get(0));
		assertEquals("b", list.get(1));
	}

	@Test
	void removeFirst_returnsHeadValue() {
		var list = new SinglyLinkedList<Integer>();
		list.addLast(10);
		list.addLast(20);
		assertEquals(10, list.removeFirst());
		assertEquals(1, list.size());
		assertEquals(20, list.get(0));
	}

	@Test
	void singleElement_addThenRemove_isEmptyAgain() {
		var list = new SinglyLinkedList<Integer>();
		list.addFirst(42);
		assertEquals(42, list.removeFirst());
		assertTrue(list.isEmpty());
	}

	@Test
	void remove_withDuplicates_removesFirstOccurrenceOnly() {
		var list = new SinglyLinkedList<Integer>();
		list.addLast(1);
		list.addLast(7);
		list.addLast(7);
		assertTrue(list.remove(7));
		assertEquals(2, list.size());
		assertTrue(list.contains(7));
	}

	@Test
	void contains_reportsMembership() {
		var list = new SinglyLinkedList<Integer>();
		list.addLast(5);
		assertTrue(list.contains(5));
		assertFalse(list.contains(6));
	}

	@Test
	void reverse_reversesOrder() {
		var list = new SinglyLinkedList<Integer>();
		for (int i = 1; i <= 4; i++) {
			list.addLast(i);
		}
		list.reverse();
		assertEquals(4, list.get(0));
		assertEquals(1, list.get(3));
	}

	@Test
	void largeInput_maintainsSizeAndOrder() {
		var list = new SinglyLinkedList<Integer>();
		for (int i = 0; i < 1000; i++) {
			list.addLast(i);
		}
		assertEquals(1000, list.size());
		assertEquals(0, list.get(0));
		assertEquals(999, list.get(999));
	}
}
