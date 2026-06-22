import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem01Test {

	static ListNode of(int... vals) {
		ListNode head = null;
		for (int i = vals.length - 1; i >= 0; i--) {
			head = new ListNode(vals[i], head);
		}
		return head;
	}

	static int[] toArray(ListNode head) {
		int n = 0;
		for (ListNode c = head; c != null; c = c.next) {
			n++;
		}
		int[] out = new int[n];
		int i = 0;
		for (ListNode c = head; c != null; c = c.next) {
			out[i++] = c.val;
		}
		return out;
	}

	@Test
	void reverse_multipleNodes() {
		assertEquals(4, toArray(new Problem01().reverse(of(1, 2, 3, 4)))[0]);
	}

	@Test
	void reverse_singleNode() {
		var r = new Problem01().reverse(of(7));
		assertEquals(7, r.val);
		assertNull(r.next);
	}

	@Test
	void reverse_empty() {
		assertNull(new Problem01().reverse(null));
	}
}
