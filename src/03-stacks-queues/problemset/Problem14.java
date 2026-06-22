/**
 * Problem 14 — Simplify Path.
 *
 * <p>Given an absolute Unix-style path, return its canonical form (single slashes, no trailing
 * slash, no {@code .}, and each {@code ..} popping a directory) using a stack of components.
 */
final class Problem14 {

	private Problem14() {}

	/**
	 * Returns the canonical simplified form of the path.
	 *
	 * @param path an absolute Unix-style path
	 * @return the canonical path
	 */
	static String simplifyPath(String path) {
		// TODO: split on '/', push names, pop on "..", skip "." and empties.
		throw new UnsupportedOperationException("TODO: implement simplifyPath");
	}
}
