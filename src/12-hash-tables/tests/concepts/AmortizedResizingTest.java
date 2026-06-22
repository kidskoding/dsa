import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AmortizedResizingTest {

	@Test
	void putGet_returnsStoredValue() {
		var sut = new AmortizedResizing<String, Integer>();
		sut.put("a", 1);
		assertEquals(1, sut.get("a"));
	}

	@Test
	void manyPuts_growsCapacity() {
		var sut = new AmortizedResizing<Integer, Integer>();
		int initial = sut.capacity();
		for (int i = 0; i < 100; i++) {
			sut.put(i, i * i);
		}
		assertEquals(100, sut.size());
		assertTrue(sut.capacity() > initial);
		assertEquals(81, sut.get(9));
	}

	@Test
	void entriesSurviveResize() {
		var sut = new AmortizedResizing<Integer, Integer>();
		for (int i = 0; i < 64; i++) {
			sut.put(i, i);
		}
		for (int i = 0; i < 64; i++) {
			assertTrue(sut.containsKey(i));
			assertEquals(i, sut.get(i));
		}
	}

	@Test
	void removeMany_shrinksCapacity() {
		var sut = new AmortizedResizing<Integer, Integer>();
		for (int i = 0; i < 100; i++) {
			sut.put(i, i);
		}
		int grown = sut.capacity();
		for (int i = 0; i < 95; i++) {
			sut.remove(i);
		}
		assertEquals(5, sut.size());
		assertTrue(sut.capacity() < grown);
	}

	@Test
	void remove_missingKey_returnsFalse() {
		var sut = new AmortizedResizing<String, Integer>();
		assertFalse(sut.remove("missing"));
	}
}
