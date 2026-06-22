import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	void newStackIsEmpty() {
		Stack<Integer> stack = new Stack<>();
		assertTrue(stack.isEmpty());
		assertEquals(0, stack.size());
	}

	@Test
	void pushThenPeekAndPopIsLifo() {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		assertFalse(stack.isEmpty());
		assertEquals(3, stack.size());
		assertEquals(3, stack.peek());
		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
		assertTrue(stack.isEmpty());
	}

	@Test
	void singleElementRoundTrip() {
		Stack<String> stack = new Stack<>();
		stack.push("only");
		assertEquals("only", stack.peek());
		assertEquals(1, stack.size());
		assertEquals("only", stack.pop());
		assertTrue(stack.isEmpty());
	}

	@Test
	void popOnEmptyThrows() {
		Stack<Integer> stack = new Stack<>();
		assertThrows(NoSuchElementException.class, stack::pop);
	}

	@Test
	void peekOnEmptyThrows() {
		Stack<Integer> stack = new Stack<>();
		assertThrows(NoSuchElementException.class, stack::peek);
	}

	@Test
	void largeNumberOfPushesAndPops() {
		Stack<Integer> stack = new Stack<>();
		int n = 10_000;
		for (int i = 0; i < n; i++) {
			stack.push(i);
		}
		assertEquals(n, stack.size());
		for (int i = n - 1; i >= 0; i--) {
			assertEquals(i, stack.pop());
		}
		assertTrue(stack.isEmpty());
	}
}
