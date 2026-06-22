import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	@Test
	void getPut_basicHitAndMiss() {
		var cache = new Problem11(2);
		cache.put(1, 10);
		cache.put(2, 20);
		assertEquals(10, cache.get(1));
		assertEquals(-1, cache.get(3));
	}

	@Test
	void put_overCapacity_evictsLeastRecentlyUsed() {
		var cache = new Problem11(2);
		cache.put(1, 10);
		cache.put(2, 20);
		cache.get(1); // 1 is now most-recently-used; 2 is LRU
		cache.put(3, 30); // evicts key 2
		assertEquals(-1, cache.get(2));
		assertEquals(10, cache.get(1));
		assertEquals(30, cache.get(3));
	}
}
