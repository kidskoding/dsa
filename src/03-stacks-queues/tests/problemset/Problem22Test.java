import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem22Test {

	@Test
	void smallArray() {
		assertEquals(17, Problem22.sumSubarrayMins(new int[] {3, 1, 2, 4}));
	}

	@Test
	void largerArray() {
		assertEquals(444, Problem22.sumSubarrayMins(new int[] {11, 81, 94, 43, 3}));
	}
}
