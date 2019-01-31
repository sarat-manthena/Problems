package com.learning.problems;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("sarat", "tarsa")?"Is Anagram":"Not an anagram");

	}
	static boolean isAnagram(String s1,String s2) {
		//By sorting
		char[] input1 = s1.toCharArray();
		Arrays.sort(input1);
		char[] input2 = s2.toCharArray();
		Arrays.sort(input2);
		s1 = new String(input1);
		s2 = new String(input2);
		return s1.equals(s2);
	}

}
