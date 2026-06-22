import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void rangeReverse_reversesSubrange() {
		var sut = new Problem14();
		int[] values = {1, 2, 3, 4, 5};
		assertArrayEquals(new int[] {1, 4, 3, 2, 5}, sut.rangeReverse(values, 1, 3));
	}
}
