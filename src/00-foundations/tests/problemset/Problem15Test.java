import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	@Test
	void maxLayers_ten() {
		assertEquals(4L, new Problem15().maxLayers(10));
	}

	@Test
	void maxLayers_zero() {
		assertEquals(0L, new Problem15().maxLayers(0));
	}
}
