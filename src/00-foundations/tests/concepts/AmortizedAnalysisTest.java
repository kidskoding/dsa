import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AmortizedAnalysisTest {

	@Test
	void dynamicArrayCopies_eightAppends_countsResizeCopies() {
		var sut = new AmortizedAnalysis();
		assertEquals(7L, sut.dynamicArrayCopies(8));
	}

	@Test
	void binaryCounterFlips_threeIncrements_returnsFour() {
		var sut = new AmortizedAnalysis();
		assertEquals(4L, sut.binaryCounterFlips(3));
	}

	@Test
	void multipopWork_pushesThenMultipop_countsAllMutations() {
		var sut = new AmortizedAnalysis();
		assertEquals(5L, sut.multipopWork(new int[] {1, 2, 3, -2}));
	}
}
