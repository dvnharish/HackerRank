package com.prep.interview.interviewpreparationkit;
public class RepeatedString {

	static long repeatedString(String s, long n) {

		long numOfS = n / s.length();
		long rest = n % s.length();

		if (!s.contains("a"))
			return 0;

		long totalACounter = aCounter(s, rest) + numOfS * aCounter(s, s.length());

		return totalACounter;
	}

	static long aCounter(String s, long end) {

		int count = 0;
		for (int i = 0; i < end; i++) {
			if (s.charAt(i) == 'a')
				count++;
		}

		return count;
	}


	public static void main(String[] args)  {
		String inputString = "aba";
		long lengthOfTheString = 1000000000L;
		System.out.println(repeatedString(inputString, lengthOfTheString));
	}
}
