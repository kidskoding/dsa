import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void reverse_word_returnsReversed() {
		assertEquals("cba", new Problem03().reverse("abc"));
	}

	@Test
	void reverse_empty_returnsEmpty() {
		assertEquals("", new Problem03().reverse(""));
	}
}
