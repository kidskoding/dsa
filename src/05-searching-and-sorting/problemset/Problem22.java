/**
 * Problem 22 — Koko Eating Bananas. Return the minimum integer eating speed at which Koko can finish
 * all {@code piles} within {@code h} hours, eating from one pile per hour. Binary-search the answer
 * over {@code [1, max(piles)]} using the monotone feasibility predicate.
 */
class Problem22 {

	/**
	 * Returns the least integer eating speed such that Koko can finish every pile in {@code piles}
	 * within {@code h} hours (each hour she eats up to that many bananas from a single pile).
	 *
	 * @param piles the bananas in each pile
	 * @param h the available hours, with {@code h >= piles.length}
	 * @return the minimum feasible eating speed
	 */
	int minEatingSpeed(int[] piles, int h) {
		// TODO: binary-search the speed; feasibility is monotone.
		throw new UnsupportedOperationException("TODO: implement minEatingSpeed");
	}
}
