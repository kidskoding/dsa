/**
 * Utilities for measuring amortized cost via simulation. Implement each method from first
 * principles — see the workbook page {@code amortized-analysis.md} for the aggregate, accounting,
 * and potential methods.
 */
class AmortizedAnalysis {

	/**
	 * Simulates {@code n} appends into a dynamic array that doubles its capacity when full (starting
	 * from capacity 1) and returns the total number of element copies performed during resizes.
	 *
	 * @param n the number of appends, n &ge; 0
	 * @return total element copies across all resize operations
	 */
	public long dynamicArrayCopies(int n) {
		// TODO: track capacity, doubling when full and counting copies on each resize.
		throw new UnsupportedOperationException("TODO: implement dynamicArrayCopies");
	}

	/**
	 * Performs {@code k} increments on a binary counter starting at zero and returns the total number
	 * of bit flips. The amortized cost per increment should approach 2.
	 *
	 * @param k the number of increments, k &ge; 0
	 * @return total bit flips across all increments
	 */
	public long binaryCounterFlips(int k) {
		// TODO: simulate the increments, counting each bit toggled.
		throw new UnsupportedOperationException("TODO: implement binaryCounterFlips");
	}

	/**
	 * Replays a sequence of stack operations encoded as integers — a positive value pushes that
	 * value, a negative value {@code -j} pops up to {@code j} elements — and returns the total number
	 * of stack mutations (pushes plus pops) performed.
	 *
	 * @param operations the encoded operation sequence
	 * @return total number of push and pop mutations
	 */
	public long multipopWork(int[] operations) {
		// TODO: maintain a stack size, applying pushes and bounded multipops while counting mutations.
		throw new UnsupportedOperationException("TODO: implement multipopWork");
	}
}
