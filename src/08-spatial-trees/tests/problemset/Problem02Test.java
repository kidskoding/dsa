import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void contains_interiorPoint_isTrue() {
		var sut = new Problem02();
		assertTrue(sut.contains(new Point2D(2, 2), 0, 0, 5, 5));
	}

	@Test
	void contains_boundaryPoint_isTrue() {
		var sut = new Problem02();
		assertTrue(sut.contains(new Point2D(5, 0), 0, 0, 5, 5));
	}

	@Test
	void contains_outsidePoint_isFalse() {
		var sut = new Problem02();
		assertFalse(sut.contains(new Point2D(6, 2), 0, 0, 5, 5));
	}
}
