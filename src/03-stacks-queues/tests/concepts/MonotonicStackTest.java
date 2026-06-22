import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MonotonicStackTest {

	@Test
	void nextGreaterToRight_mixed_returnsNearestLargerOrMinusOne() {
		var ms = new MonotonicStack();
		assertArrayEquals(new int[] {2, 3, 4, -1}, ms.nextGreaterToRight(new int[] {1, 2, 3, 4}));
	}

	@Test
	void nextGreaterToRight_descending_allMinusOne() {
		var ms = new MonotonicStack();
		assertArrayEquals(new int[] {-1, -1, -1}, ms.nextGreaterToRight(new int[] {3, 2, 1}));
	}

	@Test
	void previousSmallerIndex_tracksNearestSmallerOnLeft() {
		var ms = new MonotonicStack();
		assertArrayEquals(new int[] {-1, 0, 1, -1}, ms.previousSmallerIndex(new int[] {2, 4, 5, 1}));
	}

	@Test
	void largestRectangleArea_classicHistogram_returnsTen() {
		var ms = new MonotonicStack();
		assertEquals(10, ms.largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3}));
	}

	@Test
	void largestRectangleArea_singleBar_returnsHeight() {
		var ms = new MonotonicStack();
		assertEquals(7, ms.largestRectangleArea(new int[] {7}));
	}
}
