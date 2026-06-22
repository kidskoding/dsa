import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class Problem10Test {

	@Test
	void intersection_shared() {
		ListNode shared = new ListNode(8, new ListNode(4, new ListNode(5)));
		ListNode a = new ListNode(4, new ListNode(1, shared));
		ListNode b = new ListNode(5, new ListNode(6, new ListNode(1, shared)));
		assertSame(shared, new Problem10().getIntersectionNode(a, b));
	}

	@Test
	void intersection_sharedTail() {
		ListNode shared = new ListNode(2, new ListNode(4));
		ListNode a = new ListNode(1, new ListNode(9, new ListNode(1, shared)));
		ListNode b = new ListNode(3, shared);
		assertSame(shared, new Problem10().getIntersectionNode(a, b));
	}

	@Test
	void intersection_none() {
		ListNode a = new ListNode(2, new ListNode(6, new ListNode(4)));
		ListNode b = new ListNode(1, new ListNode(5));
		assertNull(new Problem10().getIntersectionNode(a, b));
	}
}
