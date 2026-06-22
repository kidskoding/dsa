/**
 * Problem 17: Festival Stage Cabling (budget-bounded Kruskal). Install cables greedily by cost within
 * a budget; return the number of stages drawn into the generator's component.
 */
class Problem17 {

	/**
	 * Returns the number of stages (including stage 0) powered within {@code budget}.
	 *
	 * @param n the number of stages
	 * @param cables undirected cables {@code {u, v, w}} with install cost {@code w}
	 * @param budget the total install budget
	 * @return the size of stage 0's component after budgeted greedy installation
	 */
	long maxPoweredStages(int n, int[][] cables, long budget) {
		// TODO: sort cables by cost; union endpoints while running total stays within budget; return size of component holding 0.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
