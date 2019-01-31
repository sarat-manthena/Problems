package com.learning.problems;

public class ChangeOddWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input : This is a test String
		 * Output: THIS si A tset STRING
		 */
		String input = "This is a test String";
		System.out.println(reverseString(input));

	}
	
	static String reverseString(String input) {
		String[] strArray = input.split(" ");
		StringBuilder sb = new StringBuilder();
		int i=1;
		for(String tmp: strArray) {
			if(i%2 ==0) {
				String reverse = reverseString1(tmp);
				sb.append(reverse);
				sb.append(" ");
			}else {
				sb.append(tmp.toUpperCase());
				sb.append(" ");
				
			}
			i++;
		}
		return sb.toString();
		
	}
	static private String reverseString1(String input) {
		String reverse="";
		char[] inputArray = input.toCharArray();
		for(int i=inputArray.length-1; i >= 0; i--) {
			reverse = reverse+inputArray[i];
		}
		return reverse;
	}

}
