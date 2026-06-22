import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void collatzSteps_one() {
		assertEquals(0L, new Problem14().collatzSteps(1));
	}

	@Test
	void collatzSteps_six() {
		assertEquals(8L, new Problem14().collatzSteps(6));
	}
}
