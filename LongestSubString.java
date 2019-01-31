package com.learning.problems;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));

	}
	
	static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int res = 0;        
        HashSet<Character> set = new HashSet<>();
        Queue<Character> que = new LinkedList<>();
        for (char ch : s.toCharArray()){
            if (set.contains(ch)){
                while(que.peek() != ch)
                    set.remove(que.poll());
                set.remove(que.poll());
            }
            set.add(ch);
            que.offer(ch);
            if (que.size() > res)
                    res = que.size();
        }
        return res;
    }

}
