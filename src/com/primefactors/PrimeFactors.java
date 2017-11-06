package com.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	
	public static List<Integer> computeFactorsFor(int i) {
		ArrayList<Integer> factors = new java.util.ArrayList<Integer>();
		if (i > 1) 
		{
			while (i % 2 == 0)
			{
				factors.add(2);
				i /= 2;
			}
			if (i > 1) 
			{
				factors.add(i);
			}
		}
		return factors;
	}

}
