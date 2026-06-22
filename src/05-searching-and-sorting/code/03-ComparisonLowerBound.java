/**
 * The decision-tree argument for the \(\Omega(n\log n)\) lower bound on comparison sorting. A
 * comparison sort of {@code n} distinct elements corresponds to a binary decision tree with at
 * least {@code n!} leaves; its height (the worst-case comparison count) is therefore at least
 * {@code ceil(log2(n!))}. See the workbook page {@code comparison-lower-bound.md}.
 */
class ComparisonLowerBound {

	/**
	 * Returns the information-theoretic minimum number of comparisons any comparison sort must make
	 * in the worst case to sort {@code n} distinct elements, i.e. {@code ceil(log2(n!))}.
	 *
	 * @param n the number of elements to sort ({@code n >= 0})
	 * @return the worst-case lower bound on comparisons
	 */
	public long minComparisonsToSort(int n) {
		// TODO: bound the decision tree height by ceil(log2(n!)) using integer arithmetic.
		throw new UnsupportedOperationException("TODO: implement minComparisonsToSort");
	}
}
