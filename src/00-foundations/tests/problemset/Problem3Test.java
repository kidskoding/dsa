import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem3Test {

	@Test
	void floorLog2_eight() {
		assertEquals(3, new Problem3().floorLog2(8));
	}

	@Test
	void floorLog2_hundred() {
		assertEquals(6, new Problem3().floorLog2(100));
	}
}
