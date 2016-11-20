package example.PrimeGenerator;

import java.util.stream.IntStream;

/**
 * Refactorings:
 * 
 * Extract Fields.
 * Extract Methods: initArrayOfIntegers, crossOutMultiples, putUncrossedIntegerIntoResult
 * Inline s with f.length
 * Rename f to isCrossed
 * Ensure for loop starts from 2
 * Extract Methods: crossOutMultipleOf, numberOfUncrossedIntegers, notCrossed
 * Rename methods to: uncrossIntegersUpTo
 * @author jacky
 * 
 */

public class PrimeGenerator {
	/**
	 * 
	 * @param maxValue
	 *            is the generation limit
	 * @return
	 */
	public int[] generatePrimes(int maxValue) {
		return IntStream.range(2, maxValue + 1)
				.filter(value -> {
					for (int i = 2; i <= value / 2; i++) {
						if (value % i == 0) {
							return false;
						}
					}
					return true;
				})
				.toArray();
	}
}
