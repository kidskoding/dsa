import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LogarithmsAndSummationsTest {

	@Test
	void floorLog2_powerOfTwo_returnsExponent() {
		var sut = new LogarithmsAndSummations();
		assertEquals(10, sut.floorLog2(1024));
	}

	@Test
	void geometricSum_ratioOfTwo_returnsClosedForm() {
		var sut = new LogarithmsAndSummations();
		assertEquals(7.0, sut.geometricSum(1.0, 2.0, 3), 1e-9);
	}

	@Test
	void harmonic_firstFew_returnsExpected() {
		var sut = new LogarithmsAndSummations();
		assertEquals(1.5, sut.harmonic(2), 1e-9);
	}
}
