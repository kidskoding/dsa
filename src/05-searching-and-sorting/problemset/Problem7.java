/**
 * Problem 7 — First Bad Version. Versions {@code 1..n} turn bad at index {@code bad} and stay bad.
 * Using only the monotone "is version v bad?" check ({@code v >= bad}), return the first bad version
 * in {@code O(log n)} checks by binary-searching the good/bad boundary.
 */
class Problem7 {

	/**
	 * Returns the first bad version among {@code 1..n}, given that versions {@code >= bad} are bad and
	 * versions {@code < bad} are good.
	 *
	 * @param n the number of versions, indexed {@code 1..n}
	 * @param bad the smallest bad version (the answer), with {@code 1 <= bad <= n}
	 * @return the first bad version
	 */
	int firstBadVersion(int n, int bad) {
		// TODO: binary-search the boundary using the predicate v >= bad.
		throw new UnsupportedOperationException("TODO: implement firstBadVersion");
	}
}
