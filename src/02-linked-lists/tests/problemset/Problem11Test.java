import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

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
	void reorder_even() {
		assertArrayEquals(new int[] {1, 4, 2, 3}, toArray(new Problem11().reorderList(of(1, 2, 3, 4))));
	}

	@Test
	void reorder_odd() {
		assertArrayEquals(new int[] {1, 5, 2, 4, 3}, toArray(new Problem11().reorderList(of(1, 2, 3, 4, 5))));
	}

	@Test
	void reorder_two() {
		assertArrayEquals(new int[] {1, 2}, toArray(new Problem11().reorderList(of(1, 2))));
	}
}
