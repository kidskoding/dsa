import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Problem13Test {

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
	void rotate_two() {
		assertArrayEquals(new int[] {4, 5, 1, 2, 3}, toArray(new Problem13().rotateRight(of(1, 2, 3, 4, 5), 2)));
	}

	@Test
	void rotate_moreThanLength() {
		assertArrayEquals(new int[] {2, 0, 1}, toArray(new Problem13().rotateRight(of(0, 1, 2), 4)));
	}

	@Test
	void rotate_empty() {
		assertNull(new Problem13().rotateRight(null, 3));
	}
}
