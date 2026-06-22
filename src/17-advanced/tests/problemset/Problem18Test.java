import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem18Test {

	@Test
	void predecessorAfterOps_answersPredecessorQueries() {
		var sut = new Problem18();
		// insert 2, insert 5, insert 11, pred(5) -> 2, delete 2, pred(5) -> NIL
		int[][] ops = {{0, 2}, {0, 5}, {0, 11}, {2, 5}, {1, 2}, {2, 5}};
		assertArrayEquals(new int[] {2, Problem18.NIL}, sut.predecessorAfterOps(16, ops));
	}
}
