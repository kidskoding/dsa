import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RecurrenceRelationsTest {

	@Test
	void masterExponent_mergeSort_returnsOne() {
		var sut = new RecurrenceRelations();
		assertEquals(1.0, sut.masterExponent(2, 2, 1.0), 1e-9);
	}

	@Test
	void hasLogFactor_balancedCase_returnsTrue() {
		var sut = new RecurrenceRelations();
		assertTrue(sut.hasLogFactor(2, 2, 1.0));
	}

	@Test
	void hasLogFactor_workDominated_returnsFalse() {
		var sut = new RecurrenceRelations();
		assertFalse(sut.hasLogFactor(2, 2, 2.0));
	}
}
