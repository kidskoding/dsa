import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem3Test {

	@Test
	void hasCycle_true() {
		ListNode a = new ListNode(3);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(0);
		ListNode d = new ListNode(-4);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = b;
		assertTrue(new Problem3().hasCycle(a));
	}

	@Test
	void hasCycle_false() {
		ListNode a = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
		assertFalse(new Problem3().hasCycle(a));
	}

	@Test
	void hasCycle_empty() {
		assertFalse(new Problem3().hasCycle(null));
	}
}
