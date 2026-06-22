import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem15Test {

	@Test
	void reorganizeString_validArrangement() {
		String out = Problem15.reorganizeString("aab");
		assertEquals(3, out.length());
		for (int i = 1; i < out.length(); i++) {
			assertTrue(out.charAt(i) != out.charAt(i - 1));
		}
	}

	@Test
	void reorganizeString_impossible() {
		assertEquals("", Problem15.reorganizeString("aaab"));
	}
}
