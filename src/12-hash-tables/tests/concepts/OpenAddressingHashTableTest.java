import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class OpenAddressingHashTableTest {

	@Test
	void putGet_returnsStoredValue() {
		var sut = new OpenAddressingHashTable<String, Integer>();
		sut.put("a", 1);
		assertEquals(1, sut.get("a"));
	}

	@Test
	void get_missingKey_returnsNull() {
		var sut = new OpenAddressingHashTable<String, Integer>();
		assertNull(sut.get("nope"));
	}

	@Test
	void put_duplicateKey_overwrites() {
		var sut = new OpenAddressingHashTable<String, Integer>();
		sut.put("a", 1);
		sut.put("a", 2);
		assertEquals(2, sut.get("a"));
		assertEquals(1, sut.size());
	}

	@Test
	void collidingKeys_probeAndRetrieve() {
		var sut = new OpenAddressingHashTable<Integer, String>();
		for (int i = 0; i < 30; i++) {
			sut.put(i, "v" + i);
		}
		assertEquals("v11", sut.get(11));
		assertEquals("v29", sut.get(29));
		assertEquals(30, sut.size());
	}

	@Test
	void remove_thenGet_returnsNullButLaterProbesWork() {
		var sut = new OpenAddressingHashTable<Integer, String>();
		sut.put(0, "a");
		sut.put(16, "b"); // likely collides/probes past slot of key 0
		assertTrue(sut.remove(0));
		assertNull(sut.get(0));
		// Tombstone must not break the probe chain to a later key.
		assertEquals("b", sut.get(16));
	}

	@Test
	void containsKey_missing_returnsFalse() {
		var sut = new OpenAddressingHashTable<String, Integer>();
		assertFalse(sut.containsKey("x"));
	}
}
