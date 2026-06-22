import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem21Test {

	private final Problem21 sut = new Problem21();

	@Test
	void findClosestElements_interior() {
		assertArrayEquals(new int[] {1, 2, 3, 4}, sut.findClosestElements(new int[] {1, 2, 3, 4, 5}, 4, 3));
	}

	@Test
	void findClosestElements_belowRange() {
		assertArrayEquals(new int[] {1, 2, 3, 4}, sut.findClosestElements(new int[] {1, 2, 3, 4, 5}, 4, -1));
	}

	@Test
	void findClosestElements_singlePick() {
		assertArrayEquals(new int[] {10}, sut.findClosestElements(new int[] {1, 1, 1, 10, 10, 10}, 1, 9));
	}
}
