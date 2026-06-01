package com.example.InterviewCoding25;

import java.util.Stack;

public class RemoveAdjacent25 {
	public static void main(String[] args) {
		String str = "aabbaccda";
		Stack<Character> st = new Stack<>();
		for (char c : str.toCharArray()) {
			if (!st.isEmpty() && c == st.peek()) {
				st.pop();
			}else {
				st.push(c);
			}
		}
		System.out.println(st);
	}
}
