import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem08Test {

	private final Problem08 sut = new Problem08();

	@Test
	void findContentChildren_oneSatisfied() {
		assertEquals(1, sut.findContentChildren(new int[] {1, 2, 3}, new int[] {1, 1}));
	}

	@Test
	void findContentChildren_bothSatisfied() {
		assertEquals(2, sut.findContentChildren(new int[] {1, 2}, new int[] {1, 2, 3}));
	}

	@Test
	void findContentChildren_noneSatisfied() {
		assertEquals(0, sut.findContentChildren(new int[] {10, 9, 8}, new int[] {5, 6, 7}));
	}
}
