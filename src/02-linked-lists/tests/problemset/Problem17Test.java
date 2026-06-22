import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem17Test {

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
	void deleteAll_basic() {
		assertArrayEquals(new int[] {1, 2, 5}, toArray(new Problem17().deleteDuplicates(of(1, 2, 3, 3, 4, 4, 5))));
	}

	@Test
	void deleteAll_removesHead() {
		assertArrayEquals(new int[] {2, 3}, toArray(new Problem17().deleteDuplicates(of(1, 1, 1, 2, 3))));
	}

	@Test
	void deleteAll_empty() {
		assertNull(new Problem17().deleteDuplicates(null));
	}
}
