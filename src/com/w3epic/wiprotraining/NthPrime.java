package com.w3epic.wiprotraining;

public class NthPrime {
	public int getNthPrime(int input1) {
		if (input1 == 1) return 2;
		if (input1 == 2) return 3;
		if (input1 == 3) return 5;
		if (input1 == 4) return 7;
		
		int i = 5;
		int number = 10;
		int nthPrime = 11;
		
		while(true) {
			boolean flag = true;
			
			for (int j = 2; j < number; j++) {
				if (number % j == 0) flag = false;
			}
			
			if (flag == true) {
				nthPrime = number;
				System.out.println(i + "thPrime: " + nthPrime);
				if (i == input1) break;
				i++;
			}
			
			number++;
		}
		//System.out.println(i+"thPrime: " + nthPrime);
		return nthPrime;
	}
}
