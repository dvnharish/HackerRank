package com.dynamic.programming;

public class CounterArrayProblems {
	public static void main(String[] args) {
		String string1 = "listening";
		String string2 = "silent";
		int str1[] = getCountOfCharacters(string1);
		int str2[] = getCountOfCharacters(string2);
		int delta = getDelta(str1, str2);
		System.out.println(delta);

	}

	private static int getDelta(int[] str1, int[] str2) {

		int countOfDelta = 0;
		if (str1.length != str2.length)
			return -1;

		for (int i = 0; i < str1.length; i++) {
			int difference = Math.abs(str1[i] - str2[i]);
			countOfDelta += difference;
		}

		return countOfDelta;
	}

	private static int[] getCountOfCharacters(String s) {
		int[] maxAlphabates = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int offSetValue = (int) 'a';
			int codeOfTheElement = c - offSetValue;
			maxAlphabates[codeOfTheElement]++;
		}
		return maxAlphabates;
	}
}
