import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class DAryHeapTest {

	@Test
	void newHeap_isEmpty() {
		var heap = new DAryHeap<Integer>(3);
		assertTrue(heap.isEmpty());
		assertEquals(0, heap.size());
	}

	@Test
	void constructor_rejectsBranchingFactorBelowTwo() {
		assertThrows(IllegalArgumentException.class, () -> new DAryHeap<Integer>(1));
	}

	@Test
	void singleInsert_peekReturnsIt() {
		var heap = new DAryHeap<Integer>(4);
		heap.insert(11);
		assertEquals(11, heap.peek());
		assertEquals(1, heap.size());
	}

	@Test
	void insertMany_extractMinReturnsAscendingOrder() {
		var heap = new DAryHeap<Integer>(3);
		int[] input = {5, 3, 8, 1, 9, 2, 7, 0};
		for (int v : input) {
			heap.insert(v);
		}
		int[] expected = {0, 1, 2, 3, 5, 7, 8, 9};
		for (int e : expected) {
			assertEquals(e, heap.extractMin());
		}
		assertTrue(heap.isEmpty());
	}

	@Test
	void duplicates_areAllReturned() {
		var heap = new DAryHeap<Integer>(2);
		heap.insert(6);
		heap.insert(6);
		assertEquals(6, heap.extractMin());
		assertEquals(6, heap.extractMin());
		assertTrue(heap.isEmpty());
	}

	@Test
	void parentAndChild_indexArithmetic() {
		var heap = new DAryHeap<Integer>(3);
		// For d = 3: child(0, 0) == 1, child(0, 2) == 3, parent(3) == 0.
		assertEquals(1, heap.child(0, 0));
		assertEquals(3, heap.child(0, 2));
		assertEquals(0, heap.parent(3));
		assertEquals(0, heap.parent(1));
	}

	@Test
	void decreaseKey_movesElementToFront() {
		var heap = new DAryHeap<Integer>(3);
		heap.insert(10);
		heap.insert(20);
		heap.insert(30);
		heap.insert(40);
		heap.decreaseKey(3, 1);
		assertEquals(1, heap.peek());
	}

	@Test
	void peekOnEmpty_throws() {
		var heap = new DAryHeap<Integer>(3);
		assertThrows(NoSuchElementException.class, heap::peek);
	}

	@Test
	void largeInput_extractsSortedAscending() {
		var heap = new DAryHeap<Integer>(4);
		for (int i = 500; i >= 1; i--) {
			heap.insert(i);
		}
		for (int i = 1; i <= 500; i++) {
			assertEquals(i, heap.extractMin());
		}
		assertTrue(heap.isEmpty());
	}
}
