package com.example.InterviewCoding27;

import java.util.Stack;

public class RemoveAdjacent27 {
	public static void main(String[] args) {
		String str = "aabccdaeffel";
		Stack<Character> st = new Stack<>();
		for (char c : str.toCharArray()) {
			if (!st.isEmpty() && st.peek() == c)
				st.pop();
			else
				st.add(c);
		}
		System.out.println(st);
	}
}
