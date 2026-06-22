import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem12Test {

	private final Problem12 sut = new Problem12();

	private static final int[][] M = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

	@Test
	void searchMatrix_present_returnsTrue() {
		assertTrue(sut.searchMatrix(M, 3));
	}

	@Test
	void searchMatrix_absent_returnsFalse() {
		assertFalse(sut.searchMatrix(M, 13));
	}

	@Test
	void searchMatrix_single_returnsTrue() {
		assertTrue(sut.searchMatrix(new int[][] {{1}}, 1));
	}
}
