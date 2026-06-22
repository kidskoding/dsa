import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FenwickTreeTest {

	@Test
	void prefixSum_afterUpdates() {
		var sut = new FenwickTree(5);
		sut.update(0, 1);
		sut.update(1, 2);
		sut.update(2, 3);
		assertEquals(6L, sut.prefixSum(2));
	}

	@Test
	void rangeSum_returnsInclusiveSum() {
		var sut = new FenwickTree(5);
		for (int i = 0; i < 5; i++) {
			sut.update(i, i + 1);
		}
		assertEquals(9L, sut.rangeSum(1, 3));
	}

	@Test
	void prefixSum_emptyTree_isZero() {
		var sut = new FenwickTree(3);
		assertEquals(0L, sut.prefixSum(2));
	}
}
