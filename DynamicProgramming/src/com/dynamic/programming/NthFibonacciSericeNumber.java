package com.dynamic.programming;

public class NthFibonacciSericeNumber {

	public static void main(String[] args) {
		System.out.println(getNthFebSerice(15));
	}

	// 011235813
	public static int getNthFebSerice(int n) {

		if (n == 1 || n == 2) {
			return 1;
		}
		if (n == 0) {
			return 0;
		}
		return getNthFebSerice(n - 2) + getNthFebSerice(n - 1);
	}

}
