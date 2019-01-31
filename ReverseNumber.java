package com.learning.problems;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = -12345;
		int output = reverseNumber(input);
		System.out.println(output);

	}
	static int reverseNumber(int input) {
		boolean isNegative = false;
		if(input < 0)
			isNegative = true;
		if(input ==0 || input==1 )
			return input;
		
		int revNumber=0;
		while(input!=0) {
			revNumber = revNumber*10;
			revNumber = revNumber+input%10;
			input = input/10;
		}
		if(isNegative == false)
			revNumber = revNumber*-1;
		
		return revNumber;
	}

}
