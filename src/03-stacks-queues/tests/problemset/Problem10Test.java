import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem10Test {

	@Test
	void removesBadPair() {
		assertEquals("leetcode", Problem10.makeGood("leEeetcode"));
	}

	@Test
	void reducesToEmpty() {
		assertEquals("", Problem10.makeGood("abBAcC"));
	}
}
