import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CacheObliviousAlgorithmsTest {

	@Test
	void recursiveTranspose_transposesRectangularMatrix() {
		var sut = new CacheObliviousAlgorithms();
		// 2x3 row-major: [1 2 3; 4 5 6] -> 3x2: [1 4; 2 5; 3 6]
		int[] in = {1, 2, 3, 4, 5, 6};
		int[] expected = {1, 4, 2, 5, 3, 6};
		assertArrayEquals(expected, sut.recursiveTranspose(in, 2, 3));
	}

	@Test
	void scanTransfers_isCeilOfNoverB() {
		var sut = new CacheObliviousAlgorithms();
		assertEquals(4L, sut.scanTransfers(10, 3));
		assertEquals(0L, sut.scanTransfers(0, 3));
	}
}
