import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

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
	void reverseK_two() {
		assertArrayEquals(new int[] {2, 1, 4, 3, 5}, toArray(new Problem15().reverseKGroup(of(1, 2, 3, 4, 5), 2)));
	}

	@Test
	void reverseK_three() {
		assertArrayEquals(new int[] {3, 2, 1, 4, 5}, toArray(new Problem15().reverseKGroup(of(1, 2, 3, 4, 5), 3)));
	}

	@Test
	void reverseK_whole() {
		assertArrayEquals(new int[] {4, 3, 2, 1}, toArray(new Problem15().reverseKGroup(of(1, 2, 3, 4), 4)));
	}
}
