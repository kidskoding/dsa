import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SegmentTreeTest {

	@Test
	void rangeSum_returnsInclusiveSum() {
		var sut = new SegmentTree(new int[] {1, 2, 3, 4, 5});
		assertEquals(9L, sut.rangeSum(1, 3));
	}

	@Test
	void update_thenQueryReflectsChange() {
		var sut = new SegmentTree(new int[] {1, 2, 3, 4, 5});
		sut.update(2, 10);
		assertEquals(16L, sut.rangeSum(1, 3));
	}

	@Test
	void rangeSum_singleElement() {
		var sut = new SegmentTree(new int[] {7});
		assertEquals(7L, sut.rangeSum(0, 0));
	}
}
