import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

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
	void partition_basic() {
		assertArrayEquals(new int[] {1, 2, 2, 4, 3, 5}, toArray(new Problem14().partition(of(1, 4, 3, 2, 5, 2), 3)));
	}

	@Test
	void partition_swap() {
		assertArrayEquals(new int[] {1, 2}, toArray(new Problem14().partition(of(2, 1), 2)));
	}

	@Test
	void partition_noneLess() {
		assertArrayEquals(new int[] {1, 2, 3}, toArray(new Problem14().partition(of(1, 2, 3), 0)));
	}
}
