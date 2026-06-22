import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem6Test {

	@Test
	void removeDuplicates_basic() {
		var sut = new Problem6();
		assertEquals(3, sut.removeDuplicates(new int[] {0, 0, 1, 1, 2}));
	}

	@Test
	void removeDuplicates_allSame() {
		var sut = new Problem6();
		assertEquals(1, sut.removeDuplicates(new int[] {1, 1, 1}));
	}

	@Test
	void removeDuplicates_allUnique() {
		var sut = new Problem6();
		assertEquals(3, sut.removeDuplicates(new int[] {1, 2, 3}));
	}
}
