import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem9Test {

	private final Problem9 sut = new Problem9();

	@Test
	void prefixSumGrowsWithInserts() {
		String[] ops = {"insert apple 3", "sum ap", "insert app 2", "sum ap"};
		assertArrayEquals(new String[] {"3", "5"}, sut.run(ops));
	}

	@Test
	void reinsertOverwritesValue() {
		String[] ops = {"insert apple 3", "insert apple 2", "sum app"};
		assertArrayEquals(new String[] {"2"}, sut.run(ops));
	}

	@Test
	void unmatchedPrefixSumsZero() {
		String[] ops = {"insert a 5", "insert b 7", "sum a", "sum c"};
		assertArrayEquals(new String[] {"5", "0"}, sut.run(ops));
	}
}
