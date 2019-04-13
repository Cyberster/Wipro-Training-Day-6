package com.w3epic.wiprotraining;

import java.util.Scanner;

public class Factorial {
	private static int factorial(int num) {
	    if (num < 2) return 1;
	    return num * factorial(num - 1);
	}
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = sc.nextInt();
	    System.out.println("\n" + num + "! = " + factorial(num));
	    sc.close();
	}
}
