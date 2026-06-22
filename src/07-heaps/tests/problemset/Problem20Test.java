import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem20Test {

	@Test
	void findMaximizedCapital_twoProjects() {
		assertEquals(4, Problem20.findMaximizedCapital(2, 0, new int[] {1, 2, 3}, new int[] {0, 1, 1}));
	}

	@Test
	void findMaximizedCapital_threeProjects() {
		assertEquals(6, Problem20.findMaximizedCapital(3, 0, new int[] {1, 2, 3}, new int[] {0, 1, 2}));
	}
}
