import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void setCountAfter_undoRevertsLastUnion() {
		var sut = new Problem14();
		// 4 singletons; union 0-1 then 2-3 (2 sets), then undo the 2-3 union (3 sets).
		int[][] ops = {{0, 0, 1}, {0, 2, 3}, {1}};
		assertEquals(3, sut.setCountAfter(4, ops));
	}

	@Test
	void setCountAfter_noOps_isAllSingletons() {
		var sut = new Problem14();
		assertEquals(4, sut.setCountAfter(4, new int[][] {}));
	}
}
