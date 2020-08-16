package com.prep.interview.interviewpreparationkit;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {

		if (ar.length == 0) {
			return -1;
		}

		Set<Integer> stockSet = new HashSet<Integer>();
		int counter = 0;
		for (int i = 0; i < ar.length; i++) {
			if (stockSet.contains(ar[i])) {
				counter++;
				stockSet.remove(ar[i]);
			} else {
				stockSet.add(ar[i]);

			}
		}
		return counter;

	}

	public static void main(String[] args) throws IOException {
		int arr[] = { 1, 2, 1, 2, 1, 3, 2 , 2};
		System.out.println(sockMerchant(7, arr));
	}
}
