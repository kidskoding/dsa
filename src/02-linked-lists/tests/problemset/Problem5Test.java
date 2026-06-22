import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem5Test {

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
	void deleteDuplicates_basic() {
		assertArrayEquals(new int[] {1, 2}, toArray(new Problem5().deleteDuplicates(of(1, 1, 2))));
	}

	@Test
	void deleteDuplicates_runs() {
		assertArrayEquals(new int[] {1, 2, 3}, toArray(new Problem5().deleteDuplicates(of(1, 1, 2, 3, 3))));
	}

	@Test
	void deleteDuplicates_empty() {
		assertNull(new Problem5().deleteDuplicates(null));
	}
}
