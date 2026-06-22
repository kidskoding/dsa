import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	@Test
	void totalWork_eight() {
		assertEquals(32L, new Problem11().totalWork(8));
	}

	@Test
	void totalWork_one() {
		assertEquals(1L, new Problem11().totalWork(1));
	}
}
