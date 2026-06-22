import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem7Test {

	private final Problem7 sut = new Problem7();

	@Test
	void firstBadVersion_middle() {
		assertEquals(4, sut.firstBadVersion(5, 4));
	}

	@Test
	void firstBadVersion_single() {
		assertEquals(1, sut.firstBadVersion(1, 1));
	}

	@Test
	void firstBadVersion_allBad() {
		assertEquals(1, sut.firstBadVersion(10, 1));
	}
}
