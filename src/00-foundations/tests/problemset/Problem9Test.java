import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem9Test {

	@Test
	void reduce_sixEighths() {
		assertArrayEquals(new long[] {3, 4}, new Problem9().reduce(6, 8));
	}

	@Test
	void reduce_negativeDenominator() {
		assertArrayEquals(new long[] {-1, 3}, new Problem9().reduce(3, -9));
	}
}
