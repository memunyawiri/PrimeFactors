package com.primefactors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static java.util.Arrays.asList;
import org.junit.jupiter.api.Test;

public class PrimFactorsTest {
	
	@Test
	public void oneHasNoPrimeFactors() {
		assertEquals(asList(), PrimeFactors.computeFactorsFor(1));
	}
	
	@Test
	public void twoIsItsOwnPrimeFactor() {
		assertEquals(asList(2), PrimeFactors.computeFactorsFor(2));
	}
	
	@Test
	public void threeIsItsOwnPrimeFactor() {
		assertEquals(asList(3), PrimeFactors.computeFactorsFor(3));
	}
	
}
