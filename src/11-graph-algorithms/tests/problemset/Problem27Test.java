import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem27Test {

	private final Problem27 sut = new Problem27();

	@Test
	void wellPlusPipes() {
		int[] wells = {1, 2, 2};
		int[][] pipes = {{1, 2, 1}, {2, 3, 1}};
		assertEquals(3, sut.minCostToSupplyWater(3, wells, pipes));
	}

	@Test
	void twoWellsBeatPipe() {
		int[] wells = {1, 1};
		int[][] pipes = {{1, 2, 1}};
		assertEquals(2, sut.minCostToSupplyWater(2, wells, pipes));
	}

	@Test
	void singleHouse() {
		int[] wells = {5};
		int[][] pipes = {};
		assertEquals(5, sut.minCostToSupplyWater(1, wells, pipes));
	}
}
