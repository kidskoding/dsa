import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ActivitySelectionTest {

	@Test
	void maxActivities_classicInstance_returnsFour() {
		var sut = new ActivitySelection();
		int[] start = {1, 3, 0, 5, 8, 5};
		int[] finish = {2, 4, 6, 7, 9, 9};
		assertEquals(4, sut.maxActivities(start, finish));
	}

	@Test
	void maxActivities_emptyInput_returnsZero() {
		var sut = new ActivitySelection();
		assertEquals(0, sut.maxActivities(new int[] {}, new int[] {}));
	}

	@Test
	void maxActivities_allOverlapping_returnsOne() {
		var sut = new ActivitySelection();
		assertEquals(1, sut.maxActivities(new int[] {0, 1, 2}, new int[] {5, 6, 7}));
	}

	@Test
	void selectActivities_returnsCompatibleIndicesByFinishTime() {
		var sut = new ActivitySelection();
		int[] start = {1, 3, 0, 5, 8, 5};
		int[] finish = {2, 4, 6, 7, 9, 9};
		assertEquals(List.of(0, 1, 3, 4), sut.selectActivities(start, finish));
	}
}
