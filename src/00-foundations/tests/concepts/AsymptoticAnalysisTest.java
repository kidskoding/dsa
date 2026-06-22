import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AsymptoticAnalysisTest {

	@Test
	void isBigO_linearIsOfQuadratic_returnsTrue() {
		var sut = new AsymptoticAnalysis();
		assertTrue(sut.isBigO(n -> n, n -> n * n, 1000));
	}

	@Test
	void isBigO_quadraticIsNotOfLinear_returnsFalse() {
		var sut = new AsymptoticAnalysis();
		assertFalse(sut.isBigO(n -> n * n, n -> n, 1000));
	}
}
