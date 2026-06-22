import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem2Test {

	static ListNode of(int... vals) {
		ListNode head = null;
		for (int i = vals.length - 1; i >= 0; i--) {
			head = new ListNode(vals[i], head);
		}
		return head;
	}

	@Test
	void middle_oddLength() {
		assertEquals(3, new Problem2().middle(of(1, 2, 3, 4, 5)).val);
	}

	@Test
	void middle_evenLengthReturnsSecond() {
		assertEquals(4, new Problem2().middle(of(1, 2, 3, 4, 5, 6)).val);
	}

	@Test
	void middle_singleNode() {
		assertEquals(1, new Problem2().middle(of(1)).val);
	}
}
