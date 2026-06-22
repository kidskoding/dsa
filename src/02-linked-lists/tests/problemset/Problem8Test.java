import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem8Test {

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
	void oddEven_basic() {
		assertArrayEquals(new int[] {1, 3, 5, 2, 4}, toArray(new Problem8().oddEvenList(of(1, 2, 3, 4, 5))));
	}

	@Test
	void oddEven_seven() {
		assertArrayEquals(new int[] {2, 3, 6, 7, 1, 5, 4}, toArray(new Problem8().oddEvenList(of(2, 1, 3, 5, 6, 4, 7))));
	}

	@Test
	void oddEven_twoNodes() {
		assertArrayEquals(new int[] {1, 2}, toArray(new Problem8().oddEvenList(of(1, 2))));
	}
}
