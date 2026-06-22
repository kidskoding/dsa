import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void hasCycle_acyclicList() {
		assertFalse(new Problem03().hasCycle(Problem01Test.of(1, 2, 3)));
	}

	@Test
	void hasCycle_emptyList() {
		assertFalse(new Problem03().hasCycle(null));
	}

	@Test
	void hasCycle_withCycle() {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		a.next = b;
		b.next = c;
		c.next = a;
		assertTrue(new Problem03().hasCycle(a));
	}
}
