package com.prep.interview.interviewpreparationkit;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * c =[0,1,0,0,0,1,0,1,0,0,0 ,1 ,0] in=[0,1,2,3,4,5,6,7,8,9,10,11,12] emma can
		 * take a= [0,2,3,4,6,8,9,10,13] b= [0,2,4,6,8,10,12]
		 **/
		int[] c = { 0, 0, 1, 0, 0, 1, 0 };

		System.out.println(jumpingOnClouds(c));

	}

	static int jumpingOnClouds(int[] c) {
		int lengthofC = c.length;
		int count = -1;
		for (int i = 0; i < c.length; i++, count++) {

			if (i + 2 < lengthofC && c[i + 2] == 0) {
				i++;
			}

		}
		return count;

	}

}
