import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ChainingHashTableTest {

	@Test
	void putGet_returnsStoredValue() {
		var sut = new ChainingHashTable<String, Integer>();
		sut.put("a", 1);
		assertEquals(1, sut.get("a"));
	}

	@Test
	void get_missingKey_returnsNull() {
		var sut = new ChainingHashTable<String, Integer>();
		assertNull(sut.get("nope"));
	}

	@Test
	void put_duplicateKey_overwritesAndKeepsSize() {
		var sut = new ChainingHashTable<String, Integer>();
		sut.put("a", 1);
		sut.put("a", 2);
		assertEquals(2, sut.get("a"));
		assertEquals(1, sut.size());
	}

	@Test
	void collidingKeys_bothRetrievable() {
		var sut = new ChainingHashTable<Integer, String>();
		// Many integer keys force multiple keys into the same bucket.
		for (int i = 0; i < 50; i++) {
			sut.put(i, "v" + i);
		}
		assertEquals("v17", sut.get(17));
		assertEquals("v49", sut.get(49));
		assertEquals(50, sut.size());
	}

	@Test
	void remove_existingKey_removesAndReportsTrue() {
		var sut = new ChainingHashTable<String, Integer>();
		sut.put("a", 1);
		assertTrue(sut.remove("a"));
		assertFalse(sut.containsKey("a"));
		assertEquals(0, sut.size());
	}

	@Test
	void remove_missingKey_returnsFalse() {
		var sut = new ChainingHashTable<String, Integer>();
		assertFalse(sut.remove("ghost"));
	}
}
