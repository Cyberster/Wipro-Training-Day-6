package com.w3epic.wiprotraining;

public class Prime {
	public int isPrime (int input1) {
		if (1 == input1) return 1;
		
		for (int i = 2; i < input1; i++) {
			if (i == input1) continue;
			if (input1 % i == 0) {
				System.out.println("1");
				return 1;
			}
		}
		System.out.println("2");
		
		return 2;
	}
}