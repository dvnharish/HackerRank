package com.dynamic.programming;

public class Factorial {

	
	public static void main(String[] args) {
		int input =15;
		System.out.println(getFact(input));
	}

	private static int getFact(int n) {
		if(n==0|| n==1) {
			return 1;
		}

		return getFact(n-1) + getFact(n-2);
	}
}
