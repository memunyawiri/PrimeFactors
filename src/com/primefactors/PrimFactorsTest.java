package com.primefactors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;

import org.junit.jupiter.api.Test;

public class PrimFactorsTest {
	
	@Test
	public void oneHasNoPrimeFactors() {
		assertEquals(Collections.emptyList(), PrimeFactors.computeFactorsFor(1));
	}
	
}
