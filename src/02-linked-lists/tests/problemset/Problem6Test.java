import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem6Test {

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
	void removeNthFromEnd_middle() {
		assertArrayEquals(new int[] {1, 2, 3, 5}, toArray(new Problem6().removeNthFromEnd(of(1, 2, 3, 4, 5), 2)));
	}

	@Test
	void removeNthFromEnd_onlyNode() {
		assertNull(new Problem6().removeNthFromEnd(of(1), 1));
	}

	@Test
	void removeNthFromEnd_head() {
		assertArrayEquals(new int[] {2}, toArray(new Problem6().removeNthFromEnd(of(1, 2), 2)));
	}
}
