import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MultidimensionalArrayTest {

	@Test
	void dimensions_afterConstruction_matchArguments() {
		var grid = new MultidimensionalArray<Integer>(3, 4);
		assertEquals(3, grid.rows());
		assertEquals(4, grid.cols());
	}

	@Test
	void constructor_negativeExtent_throws() {
		assertThrows(IllegalArgumentException.class, () -> new MultidimensionalArray<Integer>(-1, 4));
	}

	@Test
	void flatIndex_rowMajor_computesRowTimesColsPlusCol() {
		var grid = new MultidimensionalArray<Integer>(3, 4);
		assertEquals(0, grid.flatIndex(0, 0));
		assertEquals(6, grid.flatIndex(1, 2));
		assertEquals(11, grid.flatIndex(2, 3));
	}

	@Test
	void getSet_singleCell_roundTripsValue() {
		var grid = new MultidimensionalArray<Integer>(1, 1);
		grid.set(0, 0, 5);
		assertEquals(5, grid.get(0, 0));
	}

	@Test
	void set_distinctCells_areIndependent() {
		var grid = new MultidimensionalArray<Integer>(2, 2);
		grid.set(0, 0, 1);
		grid.set(0, 1, 2);
		grid.set(1, 0, 3);
		grid.set(1, 1, 4);
		assertEquals(1, grid.get(0, 0));
		assertEquals(2, grid.get(0, 1));
		assertEquals(3, grid.get(1, 0));
		assertEquals(4, grid.get(1, 1));
	}

	@Test
	void get_rowOutOfRange_throws() {
		var grid = new MultidimensionalArray<Integer>(2, 2);
		assertThrows(IndexOutOfBoundsException.class, () -> grid.get(2, 0));
	}

	@Test
	void set_colOutOfRange_throws() {
		var grid = new MultidimensionalArray<Integer>(2, 2);
		assertThrows(IndexOutOfBoundsException.class, () -> grid.set(0, 2, 9));
	}

	@Test
	void flatIndex_largeGrid_doesNotOverflow() {
		var grid = new MultidimensionalArray<Integer>(1000, 1000);
		assertEquals(999_999, grid.flatIndex(999, 999));
	}
}
