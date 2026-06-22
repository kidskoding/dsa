import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem29Test {

	private final Problem29 sut = new Problem29();

	private static boolean isWiggle(int[] a) {
		for (int i = 0; i + 1 < a.length; i++) {
			if (i % 2 == 0) {
				if (!(a[i] < a[i + 1])) {
					return false;
				}
			} else if (!(a[i] > a[i + 1])) {
				return false;
			}
		}
		return true;
	}

	@Test
	void wiggleSort_evenLength() {
		assertTrue(isWiggle(sut.wiggleSort(new int[] {1, 5, 1, 1, 6, 4})));
	}

	@Test
	void wiggleSort_withDuplicates() {
		assertTrue(isWiggle(sut.wiggleSort(new int[] {1, 3, 2, 2, 3, 1})));
	}

	@Test
	void wiggleSort_pair() {
		assertTrue(isWiggle(sut.wiggleSort(new int[] {1, 2})));
	}
}
