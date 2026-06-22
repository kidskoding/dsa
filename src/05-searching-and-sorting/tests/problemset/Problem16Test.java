import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem16Test {

	private final Problem16 sut = new Problem16();

	private static boolean isWiggle(int[] a) {
		for (int i = 0; i + 1 < a.length; i++) {
			if (i % 2 == 0) {
				if (a[i] > a[i + 1]) {
					return false;
				}
			} else if (a[i] < a[i + 1]) {
				return false;
			}
		}
		return true;
	}

	@Test
	void wiggleSort_distinctValues_producesWigglePattern() {
		int[] a = {3, 5, 2, 1, 6, 4};
		sut.wiggleSort(a);
		assertTrue(isWiggle(a));
	}

	@Test
	void wiggleSort_withDuplicates_producesWigglePattern() {
		int[] a = {1, 5, 1, 1, 6, 4};
		sut.wiggleSort(a);
		assertTrue(isWiggle(a));
	}

	@Test
	void wiggleSort_singleElement_isWiggle() {
		int[] a = {1};
		sut.wiggleSort(a);
		assertTrue(isWiggle(a));
	}

	@Test
	void wiggleSort_empty_isWiggle() {
		int[] a = {};
		sut.wiggleSort(a);
		assertTrue(isWiggle(a));
	}
}
