import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem20Test {

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
	void sort_basic() {
		assertArrayEquals(new int[] {1, 2, 3, 4}, toArray(new Problem20().sortList(of(4, 2, 1, 3))));
	}

	@Test
	void sort_negatives() {
		assertArrayEquals(new int[] {-1, 0, 3, 4, 5}, toArray(new Problem20().sortList(of(-1, 5, 3, 4, 0))));
	}

	@Test
	void sort_empty() {
		assertNull(new Problem20().sortList(null));
	}
}
