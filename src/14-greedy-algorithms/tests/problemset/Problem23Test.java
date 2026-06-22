import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem23Test {

	private final Problem23 sut = new Problem23();

	@Test
	void findMaximizedCapital_twoProjects() {
		assertEquals(4, sut.findMaximizedCapital(2, 0, new int[] {1, 2, 3}, new int[] {0, 1, 1}));
	}

	@Test
	void findMaximizedCapital_threeProjects() {
		assertEquals(6, sut.findMaximizedCapital(3, 0, new int[] {1, 2, 3}, new int[] {0, 1, 2}));
	}

	@Test
	void findMaximizedCapital_noneAffordable() {
		assertEquals(5, sut.findMaximizedCapital(1, 5, new int[] {10, 20}, new int[] {10, 10}));
	}
}
