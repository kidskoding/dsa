import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void quadrantOf_upperRight_isNE() {
		var sut = new Problem04();
		assertEquals(Problem04.Quadrant.NE, sut.quadrantOf(0, 0, new Point2D(2, 3)));
	}

	@Test
	void quadrantOf_lowerLeft_isSW() {
		var sut = new Problem04();
		assertEquals(Problem04.Quadrant.SW, sut.quadrantOf(0, 0, new Point2D(-2, -3)));
	}
}
