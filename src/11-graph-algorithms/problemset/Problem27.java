/**
 * Problem 27: Optimize Water Distribution In A Village (virtual-node MST). Return the minimum total
 * cost to supply water to every house via wells and pipes.
 */
class Problem27 {

	/**
	 * Returns the minimum total cost to supply water to all {@code n} houses.
	 *
	 * @param n the number of houses, labeled {@code 1..n}
	 * @param wells the cost to build a well at each house
	 * @param pipes undirected pipes {@code {u, v, w}} between houses
	 * @return the minimum total supply cost
	 */
	int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
		// TODO: add a virtual node 0 with an edge of weight wells[i-1] to each house; run an MST over the augmented graph.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
