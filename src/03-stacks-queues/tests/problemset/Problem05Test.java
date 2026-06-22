import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void tracksMinAcrossPushes() {
		Problem05 stack = new Problem05();
		stack.push(-2);
		stack.push(0);
		stack.push(-3);
		assertEquals(-3, stack.getMin());
		stack.pop();
		assertEquals(0, stack.top());
		assertEquals(-2, stack.getMin());
	}

	@Test
	void minWithDuplicates() {
		Problem05 stack = new Problem05();
		stack.push(1);
		stack.push(1);
		stack.push(0);
		assertEquals(0, stack.getMin());
		stack.pop();
		assertEquals(1, stack.getMin());
		stack.pop();
		assertEquals(1, stack.getMin());
	}

	@Test
	void singleElement() {
		Problem05 stack = new Problem05();
		stack.push(7);
		assertEquals(7, stack.top());
		assertEquals(7, stack.getMin());
	}
}
