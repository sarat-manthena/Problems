package com.learning.problems;

public class LongestCommonSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sub1 = "ABAB";
		String sub2 = "BABA";
		System.out.println("Longest sub string:"+getLongestSubString(sub1,sub2));

	}
	static int getLongestSubString(String sub1,String sub2) {
		char[] l1 = sub1.toCharArray();
		char[] l2 = sub2.toCharArray();
		int[][] stuff = new int[l1.length][l2.length];
		int result =0;
		for(int i=0; i< l1.length; i++) {
			for(int j=0; j< l2.length; j++) {
				if(i==0 || j ==0)
					stuff[i][j] = 0;
				else if(l1[i-1] == l2[j-1]) {
					stuff[i][j] = stuff[i-1][j-1]+1;
					result = Integer.max(stuff[i][j], result);
				}
				else
					stuff[i][j] = 0;
			}
		}
		return result;
	}

}
