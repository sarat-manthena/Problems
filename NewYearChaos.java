package com.learning.problems;

import java.util.Arrays;

/*
 * https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays&h_r=next-challenge&h_v=zen
 * 
 * input: 2,1,5,3,4
 * output : 3
 * 
 * input: 2,5,1,3,4
 * output : Too chaotic
 */
public class NewYearChaos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {1,2,5,3,7,8,6,4};
		newYearChaos(inputArray);

	}
	static void newYearChaos(int[] a) {
		int noOfBribes =0;
		boolean chaos = false;

		for(int i=a.length-1; i>=0; i--) {
			if(a[i] - (i+1) >2) {
				chaos = true;
				break;
			}
			//How to formulate this sort of idea????
			for(int j=Math.max(0,a[i]-2);j<i;j++) {
				if(a[j] > a[i])
					noOfBribes++;
			}
			
			
		}
		if(chaos == true)
			System.out.println("Too Chaotic");
		else
			System.out.println(noOfBribes);
		
		
		
	}

}
