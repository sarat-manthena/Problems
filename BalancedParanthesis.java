package com.learning.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "{()}[]";
		if(isBalanced(input))
			System.out.println("String has balanced paranthesis");
		else
			System.out.println("Paranthesis not balanced");
		

	}
	static boolean isBalanced(String input) {
		Stack<Character> s = new Stack();
		for(int i=0; i< input.length(); i++) {
			char c = input.charAt(i);
			if(c=='{'|| c=='(' || c=='[') {
				s.push(c);
			} else if(c==']') {
				if(s.isEmpty() || s.pop()!='[')
					return false;
			} else if(c==')') {
				if(s.isEmpty() || s.pop()!='(')
					return false;
			} else if(c=='}') {
				if(s.isEmpty() || s.pop()!='{')
					return false;
			} else
				return false;
		}
		return s.isEmpty();
		
		
	}

}
