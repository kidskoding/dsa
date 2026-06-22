import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem18Test {

	static ListNode of(int... vals) {
		ListNode head = null;
		for (int i = vals.length - 1; i >= 0; i--) {
			head = new ListNode(vals[i], head);
		}
		return head;
	}

	@Test
	void nextLarger_basic() {
		assertArrayEquals(new int[] {5, 5, 0}, new Problem18().nextLargerNodes(of(2, 1, 5)));
	}

	@Test
	void nextLarger_mixed() {
		assertArrayEquals(new int[] {7, 0, 5, 5, 0}, new Problem18().nextLargerNodes(of(2, 7, 4, 3, 5)));
	}

	@Test
	void nextLarger_longer() {
		assertArrayEquals(new int[] {7, 9, 9, 9, 0, 5, 0, 0}, new Problem18().nextLargerNodes(of(1, 7, 5, 1, 9, 2, 5, 1)));
	}
}
