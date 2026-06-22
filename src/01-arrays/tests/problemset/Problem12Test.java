import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void spiralOrder_threeByThree_walksClockwise() {
		var sut = new Problem12();
		int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		assertEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5), sut.spiralOrder(m));
	}

	@Test
	void spiralOrder_singleRow_returnsRow() {
		var sut = new Problem12();
		assertEquals(List.of(1, 2, 3), sut.spiralOrder(new int[][] {{1, 2, 3}}));
	}
}
