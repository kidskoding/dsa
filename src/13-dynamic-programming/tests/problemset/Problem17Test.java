import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem17Test {

	private final Problem17 p = new Problem17();

	@Test
	void horseToRos() {
		assertEquals(3, p.minDistance("horse", "ros"));
	}

	@Test
	void intentionToExecution() {
		assertEquals(5, p.minDistance("intention", "execution"));
	}

	@Test
	void emptySource() {
		assertEquals(3, p.minDistance("", "abc"));
	}
}
