import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Problem6Test {

	@Test
	void groupByMod3_spread() {
		var sut = new Problem6();
		var expected =
				Map.of(0, List.of(3, 6), 1, List.of(1, 4), 2, List.of(2, 5));
		assertEquals(expected, sut.groupByMod3(new int[] {1, 2, 3, 4, 5, 6}));
	}

	@Test
	void groupByMod3_singleKey() {
		var sut = new Problem6();
		assertEquals(Map.of(0, List.of(3, 6, 9)), sut.groupByMod3(new int[] {3, 6, 9}));
	}

	@Test
	void groupByMod3_empty() {
		var sut = new Problem6();
		assertEquals(Map.of(), sut.groupByMod3(new int[] {}));
	}
}
