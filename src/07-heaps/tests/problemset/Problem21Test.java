import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem21Test {

	@Test
	void getOrder_example() {
		int[][] tasks = {{1, 2}, {2, 4}, {3, 2}, {4, 1}};
		assertArrayEquals(new int[] {0, 2, 3, 1}, Problem21.getOrder(tasks));
	}

	@Test
	void getOrder_sameArrivalByProcessingTime() {
		int[][] tasks = {{7, 10}, {7, 12}, {7, 5}, {7, 4}, {7, 2}};
		assertArrayEquals(new int[] {4, 3, 2, 0, 1}, Problem21.getOrder(tasks));
	}
}
