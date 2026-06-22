import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem15Test {

	@Test
	void spiralOrder_square() {
		var sut = new Problem15();
		assertEquals(
				List.of(1, 2, 3, 6, 9, 8, 7, 4, 5),
				sut.spiralOrder(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
	}

	@Test
	void spiralOrder_twoByTwo() {
		var sut = new Problem15();
		assertEquals(List.of(1, 2, 4, 3), sut.spiralOrder(new int[][] {{1, 2}, {3, 4}}));
	}

	@Test
	void spiralOrder_singleRow() {
		var sut = new Problem15();
		assertEquals(List.of(1, 2, 3, 4), sut.spiralOrder(new int[][] {{1, 2, 3, 4}}));
	}
}
