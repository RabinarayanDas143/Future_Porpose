package com.example.InterviewCoding24;

import java.util.Stack;

public class RemoveAdjacent24 {
	public static void main(String[] args) {
		String str = "aabbaccda";
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (!st.isEmpty() && st.peek() == str.charAt(i))
				st.pop();
			else
				st.push(str.charAt(i));
		}
		System.out.println(st);
	}
}
