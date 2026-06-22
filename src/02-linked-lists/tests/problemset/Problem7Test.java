import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem7Test {

	static ListNode of(int... vals) {
		ListNode head = null;
		for (int i = vals.length - 1; i >= 0; i--) {
			head = new ListNode(vals[i], head);
		}
		return head;
	}

	@Test
	void isPalindrome_even() {
		assertTrue(new Problem7().isPalindrome(of(1, 2, 2, 1)));
	}

	@Test
	void isPalindrome_odd() {
		assertTrue(new Problem7().isPalindrome(of(1, 2, 3, 2, 1)));
	}

	@Test
	void isPalindrome_false() {
		assertFalse(new Problem7().isPalindrome(of(1, 2)));
	}
}
