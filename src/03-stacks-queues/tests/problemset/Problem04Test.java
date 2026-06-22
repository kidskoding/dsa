import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void lifoOrdering() {
		Problem04<Integer> stack = new Problem04<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
		assertTrue(stack.isEmpty());
	}

	@Test
	void interleavedOperations() {
		Problem04<Integer> stack = new Problem04<>();
		stack.push(1);
		stack.push(2);
		assertEquals(2, stack.pop());
		stack.push(3);
		assertFalse(stack.isEmpty());
		assertEquals(3, stack.pop());
		assertEquals(1, stack.pop());
		assertTrue(stack.isEmpty());
	}

	@Test
	void newStackIsEmpty() {
		assertTrue(new Problem04<Integer>().isEmpty());
	}
}
