import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class QueueTest {

	@Test
	void newQueueIsEmpty() {
		Queue<Integer> queue = new Queue<>();
		assertTrue(queue.isEmpty());
		assertEquals(0, queue.size());
	}

	@Test
	void enqueueThenPeekAndDequeueIsFifo() {
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);

		assertFalse(queue.isEmpty());
		assertEquals(3, queue.size());
		assertEquals(1, queue.peek());
		assertEquals(1, queue.dequeue());
		assertEquals(2, queue.dequeue());
		assertEquals(3, queue.dequeue());
		assertTrue(queue.isEmpty());
	}

	@Test
	void singleElementRoundTrip() {
		Queue<String> queue = new Queue<>();
		queue.enqueue("only");
		assertEquals("only", queue.peek());
		assertEquals(1, queue.size());
		assertEquals("only", queue.dequeue());
		assertTrue(queue.isEmpty());
	}

	@Test
	void interleavedEnqueueDequeue() {
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(1);
		queue.enqueue(2);
		assertEquals(1, queue.dequeue());
		queue.enqueue(3);
		assertEquals(2, queue.dequeue());
		assertEquals(3, queue.dequeue());
		assertTrue(queue.isEmpty());
	}

	@Test
	void dequeueOnEmptyThrows() {
		Queue<Integer> queue = new Queue<>();
		assertThrows(NoSuchElementException.class, queue::dequeue);
	}

	@Test
	void peekOnEmptyThrows() {
		Queue<Integer> queue = new Queue<>();
		assertThrows(NoSuchElementException.class, queue::peek);
	}

	@Test
	void largeNumberOfEnqueuesAndDequeues() {
		Queue<Integer> queue = new Queue<>();
		int n = 10_000;
		for (int i = 0; i < n; i++) {
			queue.enqueue(i);
		}
		assertEquals(n, queue.size());
		for (int i = 0; i < n; i++) {
			assertEquals(i, queue.dequeue());
		}
		assertTrue(queue.isEmpty());
	}
}
