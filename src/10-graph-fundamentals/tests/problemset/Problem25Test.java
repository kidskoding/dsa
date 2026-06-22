import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem25Test {

	private final Problem25 sut = new Problem25();

	@Test
	void capture_interior() {
		char[][] board = {{'X', 'X', 'X'}, {'X', 'O', 'X'}, {'X', 'X', 'X'}};
		char[][] expected = {{'X', 'X', 'X'}, {'X', 'X', 'X'}, {'X', 'X', 'X'}};
		assertArrayEquals(expected, sut.solve(board));
	}

	@Test
	void capture_borderSurvives() {
		char[][] board = {{'X', 'O', 'X'}, {'X', 'O', 'X'}};
		char[][] expected = {{'X', 'O', 'X'}, {'X', 'O', 'X'}};
		assertArrayEquals(expected, sut.solve(board));
	}

	@Test
	void capture_mixed() {
		char[][] board = {
			{'X', 'X', 'X', 'X'},
			{'X', 'O', 'O', 'X'},
			{'X', 'X', 'O', 'X'},
			{'X', 'O', 'X', 'X'}
		};
		char[][] expected = {
			{'X', 'X', 'X', 'X'},
			{'X', 'X', 'X', 'X'},
			{'X', 'X', 'X', 'X'},
			{'X', 'O', 'X', 'X'}
		};
		assertArrayEquals(expected, sut.solve(board));
	}
}
