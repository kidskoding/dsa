import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem23Test {

	private final Problem23 sut = new Problem23();

	@Test
	void escape_openPath() {
		char[][] maze = {{'S', '.', '.'}, {'#', '#', '.'}, {'.', '.', 'E'}};
		assertEquals(4, sut.shortestEscape(maze));
	}

	@Test
	void escape_walledOff() {
		char[][] maze = {{'S', '#', 'E'}};
		assertEquals(-1, sut.shortestEscape(maze));
	}

	@Test
	void escape_straightLine() {
		char[][] maze = {{'S', '.', 'E'}};
		assertEquals(2, sut.shortestEscape(maze));
	}
}
