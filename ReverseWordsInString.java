package com.learning.problems;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "My name is Sarat";
		String[] inputArray = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String s: inputArray) {
			sb.append(reverseString(s));
			sb.append(" ");
		}
		System.out.println(sb.toString());

	}
	static String reverseString(String s) {
		char[] inputArray = s.toCharArray();
		String reverse = "";
		for(int i=inputArray.length-1; i>=0; i--) {
			reverse = reverse+inputArray[i];
		}
		return reverse;
	}

}
