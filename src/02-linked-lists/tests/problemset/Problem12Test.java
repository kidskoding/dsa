import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

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
	void add_basic() {
		assertArrayEquals(new int[] {7, 8, 0}, toArray(new Problem12().addTwoNumbers(of(7, 2, 4), of(5, 6))));
	}

	@Test
	void add_zero() {
		assertArrayEquals(new int[] {0}, toArray(new Problem12().addTwoNumbers(of(0), of(0))));
	}

	@Test
	void add_carryExtends() {
		assertArrayEquals(new int[] {1, 0, 0}, toArray(new Problem12().addTwoNumbers(of(9, 9), of(1))));
	}
}
