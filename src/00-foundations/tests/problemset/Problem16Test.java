import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	@Test
	void smallestN_kTwo() {
		assertEquals(5L, new Problem16().smallestN(2));
	}

	@Test
	void smallestN_kThree() {
		assertEquals(10L, new Problem16().smallestN(3));
	}
}
