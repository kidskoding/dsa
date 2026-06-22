import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem19Test {

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
	void merge_two() {
		assertArrayEquals(new int[] {4, 11}, toArray(new Problem19().mergeNodes(of(0, 3, 1, 0, 4, 5, 2, 0))));
	}

	@Test
	void merge_three() {
		assertArrayEquals(new int[] {1, 3, 4}, toArray(new Problem19().mergeNodes(of(0, 1, 0, 3, 0, 2, 2, 0))));
	}

	@Test
	void merge_one() {
		assertArrayEquals(new int[] {5}, toArray(new Problem19().mergeNodes(of(0, 5, 0))));
	}
}
