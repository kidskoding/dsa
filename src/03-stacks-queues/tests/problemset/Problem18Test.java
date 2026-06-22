import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem18Test {

	@Test
	void flatRepeats() {
		assertEquals("aaabcbc", Problem18.decodeString("3[a]2[bc]"));
	}

	@Test
	void nestedRepeats() {
		assertEquals("accaccacc", Problem18.decodeString("3[a2[c]]"));
	}
}
