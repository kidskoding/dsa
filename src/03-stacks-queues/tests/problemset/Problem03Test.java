import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void fifoOrdering() {
		Problem03<Integer> queue = new Problem03<>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		assertEquals(1, queue.dequeue());
		assertEquals(2, queue.dequeue());
		assertEquals(3, queue.dequeue());
		assertTrue(queue.isEmpty());
	}

	@Test
	void interleavedOperations() {
		Problem03<Integer> queue = new Problem03<>();
		queue.enqueue(1);
		queue.enqueue(2);
		assertEquals(1, queue.dequeue());
		queue.enqueue(3);
		assertFalse(queue.isEmpty());
		assertEquals(2, queue.dequeue());
		assertEquals(3, queue.dequeue());
		assertTrue(queue.isEmpty());
	}

	@Test
	void newQueueIsEmpty() {
		assertTrue(new Problem03<Integer>().isEmpty());
	}
}
