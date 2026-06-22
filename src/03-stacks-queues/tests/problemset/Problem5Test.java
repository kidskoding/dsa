import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem5Test {

	@Test
	void lifoOrder() {
		Problem5 s = new Problem5();
		s.push(1);
		s.push(2);
		assertEquals(2, s.top());
		assertEquals(2, s.pop());
		assertFalse(s.empty());
	}

	@Test
	void drainsEmpty() {
		Problem5 s = new Problem5();
		s.push(8);
		assertEquals(8, s.pop());
		assertTrue(s.empty());
	}
}
