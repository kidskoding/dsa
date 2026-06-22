import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {

	@Test
	void newList_isEmpty() {
		var list = new DoublyLinkedList<Integer>();
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
	}

	@Test
	void addFirstAndLast_orderAndPeeks() {
		var list = new DoublyLinkedList<Integer>();
		list.addLast(2);
		list.addFirst(1);
		list.addLast(3);
		assertEquals(3, list.size());
		assertEquals(1, list.peekFirst());
		assertEquals(3, list.peekLast());
	}

	@Test
	void removeFirst_unlinksHead() {
		var list = new DoublyLinkedList<Integer>();
		list.addLast(1);
		list.addLast(2);
		assertEquals(1, list.removeFirst());
		assertEquals(2, list.peekFirst());
		assertEquals(1, list.size());
	}

	@Test
	void removeLast_unlinksTail() {
		var list = new DoublyLinkedList<Integer>();
		list.addLast(1);
		list.addLast(2);
		assertEquals(2, list.removeLast());
		assertEquals(1, list.peekLast());
		assertEquals(1, list.size());
	}

	@Test
	void singleElement_removeFromEitherEnd_isEmpty() {
		var list = new DoublyLinkedList<Integer>();
		list.addFirst(9);
		assertEquals(9, list.removeLast());
		assertTrue(list.isEmpty());
	}

	@Test
	void contains_withDuplicates() {
		var list = new DoublyLinkedList<Integer>();
		list.addLast(4);
		list.addLast(4);
		assertTrue(list.contains(4));
		assertFalse(list.contains(5));
	}

	@Test
	void largeInput_maintainsEnds() {
		var list = new DoublyLinkedList<Integer>();
		for (int i = 0; i < 1000; i++) {
			list.addLast(i);
		}
		assertEquals(1000, list.size());
		assertEquals(0, list.peekFirst());
		assertEquals(999, list.peekLast());
	}
}
