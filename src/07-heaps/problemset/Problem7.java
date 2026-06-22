/**
 * Problem 7 — Last Stone Weight.
 *
 * <p>Repeatedly smash the two heaviest stones with weights {@code x <= y}: if {@code x == y} both
 * vanish, otherwise the heavier becomes {@code y - x}. Return the weight of the last remaining
 * stone, or {@code 0} if none remain. Use a max-heap.
 */
final class Problem7 {

	private Problem7() {}

	/**
	 * Returns the weight of the last surviving stone, or {@code 0} if none remain.
	 *
	 * @param stones the stone weights
	 * @return the final stone weight, or {@code 0}
	 */
	static int lastStoneWeight(int[] stones) {
		// TODO: pop the two largest from a max-heap, push back the difference when nonzero.
		throw new UnsupportedOperationException("TODO: implement lastStoneWeight");
	}
}
