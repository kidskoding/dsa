import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class GreedyParadigmTest {

	@Test
	void greedyCoinCount_canonicalSystem_usesFewestCoins() {
		var sut = new GreedyParadigm();
		assertEquals(6, sut.greedyCoinCount(new int[] {1, 5, 10, 25}, 63));
	}

	@Test
	void greedyCoinCount_zeroAmount_usesNoCoins() {
		var sut = new GreedyParadigm();
		assertEquals(0, sut.greedyCoinCount(new int[] {1, 5, 10, 25}, 0));
	}

	@Test
	void greedyMatchesOptimum_canonicalSystem_returnsTrue() {
		var sut = new GreedyParadigm();
		assertTrue(sut.greedyMatchesOptimum(new int[] {1, 5, 10, 25}, 100));
	}

	@Test
	void greedyMatchesOptimum_nonCanonicalSystem_returnsFalse() {
		var sut = new GreedyParadigm();
		assertFalse(sut.greedyMatchesOptimum(new int[] {1, 3, 4}, 12));
	}

	@Test
	void selectGreedily_takesHighestKeyFirstWithinCapacity() {
		var sut = new GreedyParadigm();
		var picked = sut.selectGreedily(new int[] {10, 20, 30}, new int[] {1, 3, 2}, 2);
		assertEquals(List.of(20, 30), picked);
	}
}
