import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	private final Problem13 sut = new Problem13();

	@Test
	void circles_oneGroupPlusLoner() {
		assertEquals(2, sut.countFriendCircles(4, new int[][] {{0, 1}, {1, 2}}));
	}

	@Test
	void circles_twoGroups() {
		assertEquals(2, sut.countFriendCircles(5, new int[][] {{0, 1}, {2, 3}, {3, 4}}));
	}

	@Test
	void circles_noFriendships() {
		assertEquals(3, sut.countFriendCircles(3, new int[][] {}));
	}
}
