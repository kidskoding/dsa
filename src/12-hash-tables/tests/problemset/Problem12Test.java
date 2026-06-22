import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void distinctPerWindow_countsPerWindow() {
		var sut = new Problem12();
		assertArrayEquals(new int[] {2, 3, 3}, sut.distinctPerWindow(new int[] {1, 2, 1, 3, 4}, 3));
	}

	@Test
	void distinctPerWindow_fullWindow() {
		var sut = new Problem12();
		assertArrayEquals(new int[] {2}, sut.distinctPerWindow(new int[] {5, 5, 7}, 3));
	}
}
