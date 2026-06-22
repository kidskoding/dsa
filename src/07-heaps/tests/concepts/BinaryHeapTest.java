import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class BinaryHeapTest {

	@Test
	void newHeap_isEmpty() {
		var heap = new BinaryHeap<Integer>();
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
	}

	@Test
	void singleInsert_peekAndSizeReflectIt() {
		var heap = new BinaryHeap<Integer>();
		heap.insert(42);
		assertFalse(heap.isEmpty());
		assertEquals(1, heap.size());
		assertEquals(42, heap.peek());
	}

	@Test
	void insertMany_extractMinReturnsAscendingOrder() {
		var heap = new BinaryHeap<Integer>();
		int[] input = {5, 3, 8, 1, 9, 2, 7};
		for (int v : input) {
			heap.insert(v);
		}
		int[] expected = {1, 2, 3, 5, 7, 8, 9};
		for (int e : expected) {
			assertEquals(e, heap.extractMin());
		}
		assertTrue(heap.isEmpty());
	}

	@Test
	void duplicates_areAllReturned() {
		var heap = new BinaryHeap<Integer>();
		heap.insert(4);
		heap.insert(4);
		heap.insert(4);
		assertEquals(4, heap.extractMin());
		assertEquals(4, heap.extractMin());
		assertEquals(4, heap.extractMin());
		assertTrue(heap.isEmpty());
	}

	@Test
	void peekOnEmpty_throws() {
		var heap = new BinaryHeap<Integer>();
		assertThrows(NoSuchElementException.class, heap::peek);
	}

	@Test
	void extractMinOnEmpty_throws() {
		var heap = new BinaryHeap<Integer>();
		assertThrows(NoSuchElementException.class, heap::extractMin);
	}

	@Test
	void decreaseKey_movesElementToFront() {
		var heap = new BinaryHeap<Integer>();
		heap.insert(10);
		heap.insert(20);
		heap.insert(30);
		heap.decreaseKey(2, 1);
		assertEquals(1, heap.peek());
	}

	@Test
	void largeInput_extractsSortedAscending() {
		var heap = new BinaryHeap<Integer>();
		for (int i = 1000; i >= 1; i--) {
			heap.insert(i);
		}
		for (int i = 1; i <= 1000; i++) {
			assertEquals(i, heap.extractMin());
		}
		assertTrue(heap.isEmpty());
	}
}
