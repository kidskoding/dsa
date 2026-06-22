import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void runningMedian_oddAndEvenPrefixes() {
		// After 2 -> 2; 2,1 -> 1.5; 2,1,5 -> 2; 2,1,5,7 -> 3.5; 2,1,5,7,2 -> 2.
		double[] result = Problem12.runningMedian(new int[] {2, 1, 5, 7, 2});
		assertArrayEquals(new double[] {2.0, 1.5, 2.0, 3.5, 2.0}, result, 1e-9);
	}

	@Test
	void runningMedian_singleValue() {
		assertArrayEquals(new double[] {4.0}, Problem12.runningMedian(new int[] {4}), 1e-9);
	}

	@Test
	void runningMedian_withDuplicates() {
		double[] result = Problem12.runningMedian(new int[] {3, 3, 3});
		assertArrayEquals(new double[] {3.0, 3.0, 3.0}, result, 1e-9);
	}
}
