/**
 * Fast exponentiation (exponentiation by squaring) in {@code O(log e)} multiplications. Implement
 * from scratch — see the workbook page {@code fast-exponentiation.md}.
 */
class FastExponentiation {

	/**
	 * Returns {@code base} raised to a non-negative integer {@code exponent} using exponentiation by
	 * squaring, with {@code base^0 = 1}.
	 *
	 * @param base the base
	 * @param exponent a non-negative exponent
	 * @return {@code base^exponent}
	 * @throws IllegalArgumentException if {@code exponent} is negative
	 */
	public long power(long base, int exponent) {
		// TODO: recurse on exponent / 2, square the result, multiply by base when odd.
		throw new UnsupportedOperationException("TODO: implement power");
	}

	/**
	 * Returns {@code (base^exponent) mod modulus} using modular exponentiation by squaring.
	 *
	 * @param base the base
	 * @param exponent a non-negative exponent
	 * @param modulus a positive modulus
	 * @return {@code base^exponent mod modulus}
	 * @throws IllegalArgumentException if {@code exponent} is negative or {@code modulus <= 0}
	 */
	public long modPower(long base, int exponent, long modulus) {
		// TODO: same squaring recurrence, reducing modulo `modulus` at each step.
		throw new UnsupportedOperationException("TODO: implement modPower");
	}
}
