package com.primefactors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

public class PrimFactorsTest {
	
	@Test
	public void oneHasNoPrimeFactors() {
		assertEquals(Collections.emptyList(), PrimeFactors.computeFactorsFor(1));
	}
	
	@Test
	public void twoIsItsOwnPrimeFactor() {
		assertEquals(Arrays.asList(2), PrimeFactors.computeFactorsFor(2));
	}
	
}
