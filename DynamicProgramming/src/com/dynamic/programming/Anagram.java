package com.dynamic.programming;

public class Anagram {
	public static void main(String[] args) {

		String s1 = "listening";
		String s2 = "silent";
		int[] charArray1 = getCharCount(s1);
		int[] charArray2 = getCharCount(s2);
		int countOfSameElemetns = getDelta(charArray1, charArray2);
		System.out.println(countOfSameElemetns);

	}

	private static int getDelta(int[] charArray1, int[] charArray2) {
		if (charArray1.length != charArray2.length)
			return -1;
		int elementsCount = 0;
		for (int i = 0; i < charArray1.length; i++) {
			int diff = Math.abs(charArray1[i] - charArray2[i]);
			elementsCount += diff;
		}
		return elementsCount;
	}

	private static int[] getCharCount(String s) {
		int[] charCounts = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int offset = (int) 'a';
			int code = c - offset;
			charCounts[code]++;
		}
		return charCounts;
	}

}
