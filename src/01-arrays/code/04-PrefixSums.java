/**
 * Prefix/suffix sum and product techniques over a flat array. Implement each method from first
 * principles — see the workbook page {@code prefix-sums.md} for the conventions and derivations.
 */
class PrefixSums {
	/**
	 * Builds the prefix-sum array {@code P} of length {@code a.length + 1} where {@code P[0] == 0}
	 * and {@code P[i]} is the sum of the first {@code i} elements.
	 *
	 * @param a the input values
	 * @return the prefix-sum array (length {@code a.length + 1})
	 */
	public long[] buildPrefixSums(int[] a) {
		// TODO: P[0] = 0; P[i] = P[i-1] + a[i-1].
		throw new UnsupportedOperationException("TODO: implement buildPrefixSums");
	}

	/**
	 * Returns the inclusive range sum {@code a[lo..hi]} using a prefix-sum array.
	 *
	 * @param prefix a prefix-sum array as produced by {@link #buildPrefixSums(int[])}
	 * @param lo inclusive lower index into the original array
	 * @param hi inclusive upper index into the original array
	 * @return the sum of {@code a[lo..hi]}
	 */
	public long rangeSum(long[] prefix, int lo, int hi) {
		// TODO: prefix[hi + 1] - prefix[lo].
		throw new UnsupportedOperationException("TODO: implement rangeSum");
	}

	/**
	 * Builds the suffix-sum array {@code S} of length {@code a.length + 1} where
	 * {@code S[a.length] == 0} and {@code S[i]} is the sum of elements from index {@code i} on.
	 *
	 * @param a the input values
	 * @return the suffix-sum array (length {@code a.length + 1})
	 */
	public long[] buildSuffixSums(int[] a) {
		// TODO: accumulate from the right.
		throw new UnsupportedOperationException("TODO: implement buildSuffixSums");
	}

	/**
	 * Returns an array {@code out} where {@code out[i]} is the product of every element except
	 * {@code a[i]}, computed via prefix and suffix products (no division).
	 *
	 * @param a the input values
	 * @return the product-except-self array
	 */
	public long[] productExceptSelf(int[] a) {
		// TODO: out[i] = (product of a[0..i-1]) * (product of a[i+1..n-1]).
		throw new UnsupportedOperationException("TODO: implement productExceptSelf");
	}

	/**
	 * Applies a batch of inclusive range increments to a zero-initialized array of length
	 * {@code n} using the difference-array technique, returning the final array.
	 *
	 * @param n length of the array
	 * @param updates each entry is {@code {lo, hi, delta}}: add {@code delta} to {@code a[lo..hi]}
	 * @return the array after all updates
	 */
	public long[] applyRangeUpdates(int n, int[][] updates) {
		// TODO: mark diff[lo] += delta, diff[hi+1] -= delta, then prefix-sum the diff array.
		throw new UnsupportedOperationException("TODO: implement applyRangeUpdates");
	}

	/**
	 * Builds a 2-D prefix-sum table for {@code grid} so that any rectangle sum is {@code O(1)} via
	 * inclusion–exclusion. The returned table has dimensions {@code (rows + 1) x (cols + 1)}.
	 *
	 * @param grid the input grid
	 * @return the 2-D prefix-sum table
	 */
	public long[][] build2D(int[][] grid) {
		// TODO: T[r+1][c+1] = grid[r][c] + T[r][c+1] + T[r+1][c] - T[r][c].
		throw new UnsupportedOperationException("TODO: implement build2D");
	}

	/**
	 * Returns the sum of the inclusive rectangle {@code [r1..r2] x [c1..c2]} using a 2-D
	 * prefix-sum table from {@link #build2D(int[][])}.
	 *
	 * @param table a 2-D prefix-sum table
	 * @param r1 inclusive top row
	 * @param c1 inclusive left column
	 * @param r2 inclusive bottom row
	 * @param c2 inclusive right column
	 * @return the rectangle sum
	 */
	public long rangeSum2D(long[][] table, int r1, int c1, int r2, int c2) {
		// TODO: inclusion–exclusion with four corners of the table.
		throw new UnsupportedOperationException("TODO: implement rangeSum2D");
	}
}
