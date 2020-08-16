package com.prep.interview.interviewpreparationkit;

public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countValleys(8,"UUDDDUUU"));
	}

	private static int countValleys(int i, String string) {

		int altitude=0;
		int valley =0;
		for (int j = 0; j < i; j++) {
			if(string.charAt(j)=='U') {
				altitude++;
				if(altitude==0) {
					valley++;
				}
			}
			else {
				altitude--;
				
			}
		}
		
		return valley;
	}

}
