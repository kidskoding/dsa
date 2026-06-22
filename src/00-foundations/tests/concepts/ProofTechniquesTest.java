import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ProofTechniquesTest {

	@Test
	void verifyByInduction_alwaysTruePredicate_returnsTrue() {
		var sut = new ProofTechniques();
		assertTrue(sut.verifyByInduction(k -> true, 0, 100));
	}

	@Test
	void leastCounterexample_firstEvenAtTwo_returnsTwo() {
		var sut = new ProofTechniques();
		assertEquals(2, sut.leastCounterexample(k -> k % 2 == 0, 1, 10));
	}

	@Test
	void agreesEverywhere_identicalFunctions_returnsTrue() {
		var sut = new ProofTechniques();
		assertTrue(sut.agreesEverywhere(k -> k * 2, k -> k + k, 0, 50));
	}
}
