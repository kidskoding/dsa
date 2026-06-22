import java.math.BigInteger;

/**
 * Karatsuba multiplication: multiply two large integers with three recursive sub-products instead
 * of four, giving {@code Theta(n^log2(3))}. Implement from scratch — see the workbook page {@code
 * karatsuba-multiplication.md}.
 */
class KaratsubaMultiplication {

	/**
	 * Returns the product {@code x * y} computed with the Karatsuba algorithm.
	 *
	 * @param x the first factor
	 * @param y the second factor
	 * @return the product {@code x * y}
	 */
	public BigInteger multiply(BigInteger x, BigInteger y) {
		// TODO: split each number into high/low halves, form the three sub-products,
		// and recombine: x*y = high*B^2 + ((high+low cross term) - high - low)*B + low.
		throw new UnsupportedOperationException("TODO: implement multiply");
	}
}
