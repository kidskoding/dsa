import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class KaratsubaMultiplicationTest {

	@Test
	void multiply_smallNumbers_returnsProduct() {
		assertEquals(
				BigInteger.valueOf(1234L * 5678L),
				new KaratsubaMultiplication().multiply(BigInteger.valueOf(1234), BigInteger.valueOf(5678)));
	}

	@Test
	void multiply_withZero_returnsZero() {
		assertEquals(
				BigInteger.ZERO,
				new KaratsubaMultiplication().multiply(BigInteger.valueOf(987654321L), BigInteger.ZERO));
	}

	@Test
	void multiply_largeNumbers_matchesBigInteger() {
		BigInteger a = new BigInteger("9999999999999999999999999");
		BigInteger b = new BigInteger("1234567890123456789012345");
		assertEquals(a.multiply(b), new KaratsubaMultiplication().multiply(a, b));
	}
}
