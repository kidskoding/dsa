import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MemoryModelTest {

	@Test
	void capacity_afterConstruction_returnsRequestedSize() {
		var block = new MemoryModel<String>(8);
		assertEquals(8, block.capacity());
	}

	@Test
	void capacity_zeroCapacity_returnsZero() {
		var block = new MemoryModel<String>(0);
		assertEquals(0, block.capacity());
	}

	@Test
	void constructor_negativeCapacity_throws() {
		assertThrows(IllegalArgumentException.class, () -> new MemoryModel<String>(-1));
	}

	@Test
	void getSet_singleSlot_roundTripsValue() {
		var block = new MemoryModel<String>(1);
		block.set(0, "x");
		assertEquals("x", block.get(0));
	}

	@Test
	void set_overwriteSameSlot_returnsLatestValue() {
		var block = new MemoryModel<String>(4);
		block.set(2, "a");
		block.set(2, "b");
		assertEquals("b", block.get(2));
	}

	@Test
	void get_indexOutOfRange_throws() {
		var block = new MemoryModel<String>(3);
		assertThrows(IndexOutOfBoundsException.class, () -> block.get(3));
	}

	@Test
	void set_negativeIndex_throws() {
		var block = new MemoryModel<String>(3);
		assertThrows(IndexOutOfBoundsException.class, () -> block.set(-1, "x"));
	}

	@Test
	void addressOf_strideArithmetic_returnsIndexTimesElementSize() {
		var block = new MemoryModel<String>(100);
		assertEquals(0L, block.addressOf(0, 8));
		assertEquals(80L, block.addressOf(10, 8));
	}

	@Test
	void addressOf_largeIndex_doesNotOverflowLong() {
		var block = new MemoryModel<String>(1_000_000);
		assertEquals(7_999_992L, block.addressOf(999_999, 8));
	}

	@Test
	void addressOf_nonPositiveElementSize_throws() {
		var block = new MemoryModel<String>(4);
		assertThrows(IllegalArgumentException.class, () -> block.addressOf(0, 0));
	}
}
