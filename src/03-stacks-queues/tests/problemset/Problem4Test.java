import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem4Test {

	@Test
	void fifoOrder() {
		Problem4 q = new Problem4();
		q.push(1);
		q.push(2);
		assertEquals(1, q.peek());
		assertEquals(1, q.pop());
		assertFalse(q.empty());
	}

	@Test
	void drainsEmpty() {
		Problem4 q = new Problem4();
		q.push(5);
		assertEquals(5, q.pop());
		assertTrue(q.empty());
	}
}
