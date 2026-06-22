import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void middle_oddLength() {
		ListNode head = Problem01Test.of(1, 2, 3, 4, 5);
		assertEquals(3, new Problem02().middle(head).val);
	}

	@Test
	void middle_evenLength_returnsSecondMiddle() {
		ListNode head = Problem01Test.of(1, 2, 3, 4);
		assertEquals(3, new Problem02().middle(head).val);
	}

	@Test
	void middle_singleNode() {
		assertEquals(9, new Problem02().middle(Problem01Test.of(9)).val);
	}
}
