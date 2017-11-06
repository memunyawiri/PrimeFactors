package com.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	
	public static List<Integer> computeFactorsFor(int i) {
		ArrayList<Integer> factors = new java.util.ArrayList<Integer>();
		
		for (int candidate = 2; i > 1; candidate++) {
            for (; i % candidate == 0; i /= candidate)
                factors.add(candidate);
        }

        return factors;
    }

}
