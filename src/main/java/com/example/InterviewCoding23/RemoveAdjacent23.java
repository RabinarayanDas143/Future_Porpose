package com.example.InterviewCoding23;

import java.util.Stack;

public class RemoveAdjacent23 {
	public static void main(String[] args) {
		String str = "aabccda";
		Stack<Character> st = new Stack<>();
		for (char c : str.toCharArray()) {
			if (!st.isEmpty() && st.peek() == c)
				st.pop();
			else
				st.push(c);
		}
		System.out.println(st);
	}
}
