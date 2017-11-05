package com.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	
	public static List<Integer> computeFactorsFor(int i) {
		ArrayList<Integer> factors = new java.util.ArrayList<Integer>();
		if (i > 1) 
		{
			factors.add(2);
		}
		return factors;
	}

}
