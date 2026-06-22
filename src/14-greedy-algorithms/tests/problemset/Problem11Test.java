import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem11Test {

	private final Problem11 sut = new Problem11();

	@Test
	void partitionLabels_threeParts() {
		assertEquals(List.of(9, 7, 8), sut.partitionLabels("ababcbacadefegdehijhklij"));
	}

	@Test
	void partitionLabels_singlePart() {
		assertEquals(List.of(10), sut.partitionLabels("eccbbbbdec"));
	}

	@Test
	void partitionLabels_allDistinct() {
		assertEquals(List.of(1, 1, 1), sut.partitionLabels("abc"));
	}
}
