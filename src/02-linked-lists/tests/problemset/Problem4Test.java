import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem4Test {

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
	void merge_interleaves() {
		assertArrayEquals(new int[] {1, 1, 2, 3, 4, 4}, toArray(new Problem4().merge(of(1, 2, 4), of(1, 3, 4))));
	}

	@Test
	void merge_bothEmpty() {
		assertNull(new Problem4().merge(null, null));
	}

	@Test
	void merge_oneEmpty() {
		assertArrayEquals(new int[] {0}, toArray(new Problem4().merge(null, of(0))));
	}
}
