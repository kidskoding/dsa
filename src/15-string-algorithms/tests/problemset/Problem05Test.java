import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void rollingHash_emptyString_isZero() {
		assertEquals(0L, new Problem05().rollingHash("", 256L, 1_000_000_007L));
	}

	@Test
	void rollingHash_singleChar_isCharValue() {
		assertEquals((long) 'a', new Problem05().rollingHash("a", 256L, 1_000_000_007L));
	}

	@Test
	void rollingHash_hornerForm_matchesManualComputation() {
		// "ab" = 'a' * base + 'b' mod q.
		long expected = (((long) 'a' * 256L) + (long) 'b') % 1_000_000_007L;
		assertEquals(expected, new Problem05().rollingHash("ab", 256L, 1_000_000_007L));
	}
}
