import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	private final Problem14 p = new Problem14();

	@Test
	void typical() {
		assertEquals(4, p.lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
	}

	@Test
	void withDuplicatesAndDips() {
		assertEquals(4, p.lengthOfLIS(new int[] {0, 1, 0, 3, 2, 3}));
	}

	@Test
	void allEqual() {
		assertEquals(1, p.lengthOfLIS(new int[] {7, 7, 7, 7}));
	}
}
