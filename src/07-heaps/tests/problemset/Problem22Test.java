import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem22Test {

	@Test
	void mergeCost_fourPiles() {
		assertEquals(29L, Problem22.mergeCost(new int[] {4, 3, 2, 6}));
	}

	@Test
	void mergeCost_singlePileIsFree() {
		assertEquals(0L, Problem22.mergeCost(new int[] {5}));
	}
}
