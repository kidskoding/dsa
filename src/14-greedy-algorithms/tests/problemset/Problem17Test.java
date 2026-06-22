import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem17Test {

	private final Problem17 sut = new Problem17();

	@Test
	void twoCitySchedCost_basic() {
		assertEquals(110, sut.twoCitySchedCost(new int[][] {{10, 20}, {30, 200}, {400, 50}, {30, 20}}));
	}

	@Test
	void twoCitySchedCost_larger() {
		int[][] costs = {{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}};
		assertEquals(1859, sut.twoCitySchedCost(costs));
	}

	@Test
	void twoCitySchedCost_forcedSplit() {
		assertEquals(30, sut.twoCitySchedCost(new int[][] {{10, 10}, {20, 20}}));
	}
}
