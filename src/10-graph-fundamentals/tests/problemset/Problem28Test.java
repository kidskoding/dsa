import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem28Test {

	private final Problem28 sut = new Problem28();

	@Test
	void rooms_chain() {
		assertTrue(sut.canVisitAllRooms(new int[][] {{1}, {2}, {3}, {}}));
	}

	@Test
	void rooms_lockedOut() {
		assertFalse(sut.canVisitAllRooms(new int[][] {{1, 3}, {3, 0, 1}, {2}, {0}}));
	}

	@Test
	void rooms_fromZero() {
		assertTrue(sut.canVisitAllRooms(new int[][] {{1, 2}, {}, {}}));
	}
}
