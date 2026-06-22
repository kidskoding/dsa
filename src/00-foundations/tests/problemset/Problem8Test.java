import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem8Test {

	@Test
	void trailingZeros_five() {
		assertEquals(1L, new Problem8().trailingZeros(5));
	}

	@Test
	void trailingZeros_twentyFive() {
		assertEquals(6L, new Problem8().trailingZeros(25));
	}
}
