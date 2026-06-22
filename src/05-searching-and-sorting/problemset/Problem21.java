/**
 * Problem 21 — K Closest Numbers. Given a sorted array, {@code k}, and {@code x}, return the {@code
 * k} elements closest to {@code x} in ascending order. Closeness ties break toward the smaller value.
 * Binary-search a width-{@code k} window and shrink toward {@code x}.
 */
class Problem21 {

	/**
	 * Returns the {@code k} elements of the sorted array {@code arr} closest to {@code x}, in
	 * ascending order; on a distance tie the smaller value is preferred.
	 *
	 * @param arr an array sorted in ascending order
	 * @param k how many closest elements to return
	 * @param x the reference value
	 * @return the {@code k} closest elements in ascending order
	 */
	int[] findClosestElements(int[] arr, int k, int x) {
		// TODO: binary-search the left edge of the width-k window nearest x.
		throw new UnsupportedOperationException("TODO: implement findClosestElements");
	}
}
