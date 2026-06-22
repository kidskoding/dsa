import java.util.List;

/**
 * Backtracking: build solutions incrementally and abandon partial ones that can't succeed.
 * Implement from first principles — see the workbook page {@code backtracking.md}.
 */
class Backtracking {
	/**
	 * Returns every permutation of the given distinct values.
	 *
	 * @param nums distinct input values
	 * @return all permutations, each as a list of the input values
	 */
	public List<List<Integer>> permutations(int[] nums) {
		// TODO: choose an unused element, recurse, then un-choose.
		throw new UnsupportedOperationException("TODO: implement permutations");
	}

	/**
	 * Returns every subset (the power set) of the given distinct values.
	 *
	 * @param nums distinct input values
	 * @return all subsets, including the empty set
	 */
	public List<List<Integer>> subsets(int[] nums) {
		// TODO: at each index, branch on include vs. skip.
		throw new UnsupportedOperationException("TODO: implement subsets");
	}

	/**
	 * Returns the number of distinct solutions to the N-Queens problem on an {@code n x n} board.
	 *
	 * @param n the board size (and number of queens)
	 * @return the count of valid placements
	 */
	public int countNQueens(int n) {
		// TODO: place one queen per row, pruning on column and both diagonals.
		throw new UnsupportedOperationException("TODO: implement countNQueens");
	}
}
