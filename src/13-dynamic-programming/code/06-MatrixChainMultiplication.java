/**
 * Matrix-chain multiplication: given the dimensions of a chain of matrices, find the
 * parenthesization that minimizes the number of scalar multiplications. With {@code n} matrices the
 * dimension array has length {@code n + 1}, where matrix {@code i} is {@code dims[i] x dims[i+1]}.
 * This interval DP runs in {@code O(n^3)}. See {@code matrix-chain-multiplication.md}.
 */
class MatrixChainMultiplication {

	/**
	 * Returns the minimum number of scalar multiplications needed to multiply the chain whose
	 * dimensions are given by {@code dims} (matrix {@code i} is {@code dims[i] x dims[i+1]}).
	 *
	 * @param dims the dimension array of length {@code n + 1} for {@code n} matrices
	 * @return the minimum multiplication cost (0 when fewer than two matrices)
	 */
	public int minMultiplications(int[] dims) {
		// TODO: m[i][j] = min over split k of m[i][k] + m[k+1][j] + dims[i-1]*dims[k]*dims[j].
		throw new UnsupportedOperationException("TODO: implement minMultiplications");
	}
}
