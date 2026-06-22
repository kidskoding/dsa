import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LazyPropagationTest {

	@Test
	void rangeAdd_thenRangeSum_appliesUpdate() {
		var sut = new LazyPropagation(new int[] {0, 0, 0, 0, 0});
		sut.rangeAdd(1, 3, 5);
		assertEquals(15L, sut.rangeSum(0, 4));
		assertEquals(10L, sut.rangeSum(1, 2));
	}

	@Test
	void overlappingRangeAdds_accumulate() {
		var sut = new LazyPropagation(new int[] {1, 1, 1, 1});
		sut.rangeAdd(0, 1, 2);
		sut.rangeAdd(1, 3, 3);
		// [1,1,1,1] -> +2 on [0,1] -> [3,3,1,1] -> +3 on [1,3] -> [3,6,4,4], sum = 17
		assertEquals(17L, sut.rangeSum(0, 3));
	}

	@Test
	void rangeSum_withoutUpdates_returnsInitialSum() {
		var sut = new LazyPropagation(new int[] {2, 4, 6});
		assertEquals(12L, sut.rangeSum(0, 2));
	}
}
