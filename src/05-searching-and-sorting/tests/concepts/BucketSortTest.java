import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Test;

class BucketSortTest {

	private final BucketSort sut = new BucketSort();

	private static int[] sortedCopy(int[] a) {
		int[] expected = a.clone();
		Arrays.sort(expected);
		return expected;
	}

	@Test
	void sort_unorderedArray_sortsAscending() {
		int[] a = {5, 2, 9, 1, 7, 3};
		int[] expected = sortedCopy(a);
		sut.sort(a);
		assertArrayEquals(expected, a);
	}

	@Test
	void sort_emptyArray_staysEmpty() {
		int[] a = {};
		sut.sort(a);
		assertArrayEquals(new int[] {}, a);
	}

	@Test
	void sort_singleElement_isUnchanged() {
		int[] a = {42};
		sut.sort(a);
		assertArrayEquals(new int[] {42}, a);
	}

	@Test
	void sort_withDuplicates_sortsAscending() {
		int[] a = {4, 1, 4, 2, 1, 3, 4};
		int[] expected = sortedCopy(a);
		sut.sort(a);
		assertArrayEquals(expected, a);
	}

	@Test
	void sort_alreadySorted_staysSorted() {
		int[] a = {1, 2, 3, 4, 5, 6};
		sut.sort(a);
		assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, a);
	}

	@Test
	void sort_reverseSorted_sortsAscending() {
		int[] a = {9, 7, 5, 3, 1};
		sut.sort(a);
		assertArrayEquals(new int[] {1, 3, 5, 7, 9}, a);
	}

	@Test
	void sort_allEqual_staysEqual() {
		int[] a = {7, 7, 7, 7};
		sut.sort(a);
		assertArrayEquals(new int[] {7, 7, 7, 7}, a);
	}

	@Test
	void sort_largeRandomArray_sortsAscending() {
		Random rng = new Random(42);
		int[] a = new int[2_000];
		for (int i = 0; i < a.length; i++) {
			a[i] = rng.nextInt(1_000);
		}
		int[] expected = sortedCopy(a);
		sut.sort(a);
		assertArrayEquals(expected, a);
	}
}
