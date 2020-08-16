package com.dynamic.programming;

/*
 * Given an integer n, return the minimum steps to minimize n to 1
 * Avalible Steps are
 * 
 * -Decrement n by 1.
 * if n is divisible by 2, then divide n by 2.
 * if n is divisible by 3, then divide n by 3.
 * 
 * Examples
 * 10=> 3 steps (10=>9=>3=>1)
 * 15=> 4 steps (10=>5=>4=>2=>1)
 * 
 * *****/
public class MinimumStepsToMinimizeTo1 {

	public static void main(String[] args) {
		int input = 15;
		System.out.println(getMinSteps(input));
	}

	public static int getMinSteps(int n) {
		if (n == 1) {
			return 0;
		}
		int result = getMinSteps(n - 1);
		
		System.out.println(result);
		if (n % 2 == 0) {
			result = Math.min(result, getMinSteps(n / 2));
		}
		if (n % 3 == 0) {
			result = Math.min(result, getMinSteps(n / 3));
		}
		return result + 1;
	}

}
