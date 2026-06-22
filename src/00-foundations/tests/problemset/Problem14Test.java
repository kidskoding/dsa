import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void totalBitFlips_threeIncrements_returnsFour() {
		var sut = new Problem14();
		assertEquals(4L, sut.totalBitFlips(3));
	}
}
