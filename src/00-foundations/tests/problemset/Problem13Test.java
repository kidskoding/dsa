import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void digitPowerSum_ninePowerOne() {
		assertEquals(45L, new Problem13().digitPowerSum(9, 1));
	}

	@Test
	void digitPowerSum_tenPowerTwo() {
		assertEquals(286L, new Problem13().digitPowerSum(10, 2));
	}
}
