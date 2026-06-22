import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void maximizeCapital_picksMostProfitableAffordable() {
		var sut = new Problem14();
		int[] capitalRequired = {0, 1, 1};
		int[] profits = {1, 2, 3};
		assertEquals(4L, sut.maximizeCapital(2, 0, capitalRequired, profits));
	}

	@Test
	void maximizeCapital_noAffordableProject_keepsStartCapital() {
		var sut = new Problem14();
		int[] capitalRequired = {5};
		int[] profits = {10};
		assertEquals(2L, sut.maximizeCapital(1, 2, capitalRequired, profits));
	}
}
