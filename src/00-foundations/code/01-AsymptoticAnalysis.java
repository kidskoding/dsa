import java.util.function.LongUnaryOperator;

/**
 * Utilities for reasoning about asymptotic growth of functions. Implement each method from first
 * principles — see the workbook page {@code asymptotic-analysis.md} for definitions.
 */
class AsymptoticAnalysis {

	/**
	 * Returns {@code true} if {@code f} is O({@code g}), i.e. there exist constants c &gt; 0 and n0
	 * such that f(n) &le; c·g(n) for all n &ge; n0, tested over the range [1, sampleTo].
	 *
	 * @param f candidate function
	 * @param g bounding function
	 * @param sampleTo inclusive upper bound of the sample range
	 * @return whether f is big-O of g over the sampled range
	 */
	public boolean isBigO(LongUnaryOperator f, LongUnaryOperator g, long sampleTo) {
		// TODO: pick a witness constant c and threshold n0, then verify.
		throw new UnsupportedOperationException("TODO: implement isBigO");
	}
}
