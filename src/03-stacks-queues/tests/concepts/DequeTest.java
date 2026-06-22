import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class DequeTest {

	@Test
	void newDequeIsEmpty() {
		Deque<Integer> deque = new Deque<>();
		assertTrue(deque.isEmpty());
		assertEquals(0, deque.size());
	}

	@Test
	void addFirstAndRemoveFirstIsLifo() {
		Deque<Integer> deque = new Deque<>();
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addFirst(3);

		assertEquals(3, deque.size());
		assertEquals(3, deque.peekFirst());
		assertEquals(3, deque.removeFirst());
		assertEquals(2, deque.removeFirst());
		assertEquals(1, deque.removeFirst());
		assertTrue(deque.isEmpty());
	}

	@Test
	void addLastAndRemoveFirstIsFifo() {
		Deque<Integer> deque = new Deque<>();
		deque.addLast(1);
		deque.addLast(2);
		deque.addLast(3);

		assertEquals(1, deque.peekFirst());
		assertEquals(3, deque.peekLast());
		assertEquals(1, deque.removeFirst());
		assertEquals(2, deque.removeFirst());
		assertEquals(3, deque.removeFirst());
		assertTrue(deque.isEmpty());
	}

	@Test
	void mixedEndsBehaveCorrectly() {
		Deque<Integer> deque = new Deque<>();
		deque.addLast(1); // [1]
		deque.addFirst(0); // [0, 1]
		deque.addLast(2); // [0, 1, 2]
		assertEquals(0, deque.peekFirst());
		assertEquals(2, deque.peekLast());
		assertEquals(0, deque.removeFirst());
		assertEquals(2, deque.removeLast());
		assertEquals(1, deque.removeFirst());
		assertTrue(deque.isEmpty());
	}

	@Test
	void singleElementFromBothEnds() {
		Deque<String> deque = new Deque<>();
		deque.addFirst("only");
		assertEquals("only", deque.peekFirst());
		assertEquals("only", deque.peekLast());
		assertEquals("only", deque.removeLast());
		assertTrue(deque.isEmpty());
	}

	@Test
	void removeFirstOnEmptyThrows() {
		Deque<Integer> deque = new Deque<>();
		assertThrows(NoSuchElementException.class, deque::removeFirst);
	}

	@Test
	void removeLastOnEmptyThrows() {
		Deque<Integer> deque = new Deque<>();
		assertThrows(NoSuchElementException.class, deque::removeLast);
	}

	@Test
	void peekOnEmptyThrows() {
		Deque<Integer> deque = new Deque<>();
		assertThrows(NoSuchElementException.class, deque::peekFirst);
		assertThrows(NoSuchElementException.class, deque::peekLast);
	}

	@Test
	void largeNumberOfOperations() {
		Deque<Integer> deque = new Deque<>();
		int n = 10_000;
		for (int i = 0; i < n; i++) {
			deque.addLast(i);
		}
		assertEquals(n, deque.size());
		for (int i = 0; i < n; i++) {
			assertEquals(i, deque.removeFirst());
		}
		assertTrue(deque.isEmpty());
	}
}
