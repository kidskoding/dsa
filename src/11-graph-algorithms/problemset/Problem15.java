/**
 * Problem 15: The Maze II (Dijkstra over roll segments). Return the shortest distance for a ball that
 * rolls until hitting a wall to stop at the destination, or {@code -1}.
 */
class Problem15 {

	/**
	 * Returns the shortest rolling distance to stop at {@code destination}, or {@code -1}.
	 *
	 * @param maze the grid of 0 (empty) and 1 (wall)
	 * @param start the start cell {@code {row, col}}
	 * @param destination the destination cell {@code {row, col}}
	 * @return the shortest distance, or {@code -1} if unreachable
	 */
	int shortestDistance(int[][] maze, int[] start, int[] destination) {
		// TODO: Dijkstra over stop positions; each 'roll until a wall' is one weighted edge.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
