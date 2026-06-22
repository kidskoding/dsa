import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void deduplicate_keepsFirstOccurrenceOrder() {
		var sut = new Problem04();
		assertEquals(List.of(3, 1, 2), sut.deduplicate(new int[] {3, 1, 3, 2, 1}));
	}

	@Test
	void deduplicate_emptyInput_returnsEmpty() {
		var sut = new Problem04();
		assertEquals(List.of(), sut.deduplicate(new int[] {}));
	}
}
