import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem19Test {

	private final Problem19 sut = new Problem19();

	@Test
	void findDuplicate_basic() {
		assertEquals(2, sut.findDuplicate(new int[] {1, 3, 4, 2, 2}));
	}

	@Test
	void findDuplicate_other() {
		assertEquals(3, sut.findDuplicate(new int[] {3, 1, 3, 4, 2}));
	}

	@Test
	void findDuplicate_allSame() {
		assertEquals(2, sut.findDuplicate(new int[] {2, 2, 2, 2, 2}));
	}
}
