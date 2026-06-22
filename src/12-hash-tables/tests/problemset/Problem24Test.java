import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem24Test {

	@Test
	void lru_evictsLeastRecentlyUsed() {
		var cache = new Problem24(2);
		cache.put(1, 1);
		cache.put(2, 2);
		assertEquals(1, cache.get(1));
		cache.put(3, 3); // evicts key 2
		assertEquals(-1, cache.get(2));
		cache.put(4, 4); // evicts key 1
		assertEquals(-1, cache.get(1));
		assertEquals(3, cache.get(3));
		assertEquals(4, cache.get(4));
	}

	@Test
	void lru_capacityOne() {
		var cache = new Problem24(1);
		cache.put(1, 1);
		cache.put(2, 2);
		assertEquals(-1, cache.get(1));
		assertEquals(2, cache.get(2));
	}

	@Test
	void lru_updateOverwritesValue() {
		var cache = new Problem24(2);
		cache.put(1, 10);
		cache.put(1, 20);
		assertEquals(20, cache.get(1));
	}
}
