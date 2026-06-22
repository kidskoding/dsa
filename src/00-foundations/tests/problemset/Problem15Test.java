import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	@Test
	void totalMutations_pushesThenMultipop_countsAllMutations() {
		var sut = new Problem15();
		assertEquals(5L, sut.totalMutations(new int[] {1, 2, 3, -2}));
	}
}
