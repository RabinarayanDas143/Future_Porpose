package com.example.InterviewCoding21;

import java.util.Stack;

public class RemoveAdjacent21 {
	public static void main(String[] args) {
		String str = "aabccd";
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (!st.isEmpty() && st.peek() == str.charAt(i)) {
				st.pop();
			} else {
				st.add(str.charAt(i));
			}
		}
		System.out.println(st);
	}
}
