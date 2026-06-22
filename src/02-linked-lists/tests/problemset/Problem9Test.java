import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem9Test {

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
	void swapPairs_even() {
		assertArrayEquals(new int[] {2, 1, 4, 3}, toArray(new Problem9().swapPairs(of(1, 2, 3, 4))));
	}

	@Test
	void swapPairs_odd() {
		assertArrayEquals(new int[] {2, 1, 3}, toArray(new Problem9().swapPairs(of(1, 2, 3))));
	}

	@Test
	void swapPairs_single() {
		assertArrayEquals(new int[] {1}, toArray(new Problem9().swapPairs(of(1))));
	}
}
