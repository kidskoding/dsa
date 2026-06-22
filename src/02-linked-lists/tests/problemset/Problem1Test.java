import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem1Test {

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
		assertArrayEquals(new int[] {5, 4, 3, 2, 1}, toArray(new Problem1().reverse(of(1, 2, 3, 4, 5))));
	}

	@Test
	void reverse_singleNode() {
		assertArrayEquals(new int[] {7}, toArray(new Problem1().reverse(of(7))));
	}

	@Test
	void reverse_empty() {
		assertNull(new Problem1().reverse(null));
	}
}
