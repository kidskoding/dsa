import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void totalBitFlips_four() {
		assertEquals(7L, new Problem12().totalBitFlips(4));
	}

	@Test
	void totalBitFlips_eight() {
		assertEquals(15L, new Problem12().totalBitFlips(8));
	}
}
