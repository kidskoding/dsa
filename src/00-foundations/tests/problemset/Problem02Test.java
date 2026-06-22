import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void geometricSum_ratioOne_returnsLinearSum() {
		var sut = new Problem02();
		assertEquals(15.0, sut.geometricSum(5.0, 1.0, 3), 1e-9);
	}
}
