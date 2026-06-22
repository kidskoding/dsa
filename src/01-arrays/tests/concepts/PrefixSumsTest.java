import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PrefixSumsTest {

	@Test
	void rangeSum_innerRange_sumsInclusiveSlice() {
		var ps = new PrefixSums();
		int[] a = {3, 1, 4, 1, 5, 9};
		long[] p = ps.buildPrefixSums(a);
		assertEquals(4 + 1 + 5, ps.rangeSum(p, 2, 4));
	}

	@Test
	void rangeSum_fromZero_includesFirstElement() {
		var ps = new PrefixSums();
		int[] a = {3, 1, 4, 1, 5, 9};
		long[] p = ps.buildPrefixSums(a);
		assertEquals(3 + 1 + 4 + 1 + 5 + 9, ps.rangeSum(p, 0, 5));
	}

	@Test
	void buildSuffixSums_accumulatesFromRight() {
		var ps = new PrefixSums();
		int[] a = {2, 3, 5};
		long[] s = ps.buildSuffixSums(a);
		assertArrayEquals(new long[] {10, 8, 5, 0}, s);
	}

	@Test
	void productExceptSelf_noZero_multipliesAllOthers() {
		var ps = new PrefixSums();
		assertArrayEquals(new long[] {24, 12, 8, 6}, ps.productExceptSelf(new int[] {1, 2, 3, 4}));
	}

	@Test
	void productExceptSelf_singleZero_onlyZeroIndexNonZero() {
		var ps = new PrefixSums();
		assertArrayEquals(new long[] {0, 0, 9, 0}, ps.productExceptSelf(new int[] {3, 1, 0, 2}));
	}

	@Test
	void applyRangeUpdates_overlappingRanges_accumulate() {
		var ps = new PrefixSums();
		int[][] updates = {{0, 2, 1}, {1, 3, 2}};
		assertArrayEquals(new long[] {1, 3, 3, 2, 0}, ps.applyRangeUpdates(5, updates));
	}

	@Test
	void rangeSum2D_innerRectangle_sumsViaInclusionExclusion() {
		var ps = new PrefixSums();
		int[][] grid = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		long[][] t = ps.build2D(grid);
		// rectangle rows 1..2, cols 1..2 => 5+6+8+9
		assertEquals(28, ps.rangeSum2D(t, 1, 1, 2, 2));
	}
}
