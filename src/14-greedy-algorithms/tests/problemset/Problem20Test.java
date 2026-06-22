import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem20Test {

	private final Problem20 sut = new Problem20();

	@Test
	void leastInterval_withCooldown() {
		assertEquals(8, sut.leastInterval(new char[] {'A', 'A', 'A', 'B', 'B', 'B'}, 2));
	}

	@Test
	void leastInterval_noCooldown() {
		assertEquals(6, sut.leastInterval(new char[] {'A', 'A', 'A', 'B', 'B', 'B'}, 0));
	}

	@Test
	void leastInterval_dominantTask() {
		char[] tasks = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		assertEquals(16, sut.leastInterval(tasks, 2));
	}
}
