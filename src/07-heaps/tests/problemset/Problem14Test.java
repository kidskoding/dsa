import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void leastInterval_withCooldown() {
		assertEquals(8, Problem14.leastInterval(new char[] {'A', 'A', 'A', 'B', 'B', 'B'}, 2));
	}

	@Test
	void leastInterval_noCooldown() {
		assertEquals(6, Problem14.leastInterval(new char[] {'A', 'A', 'A', 'B', 'B', 'B'}, 0));
	}
}
