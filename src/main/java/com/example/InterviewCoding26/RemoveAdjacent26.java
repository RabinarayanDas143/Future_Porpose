package com.example.InterviewCoding26;

import java.util.Stack;

public class RemoveAdjacent26 {
	public static void main(String[] args) {
		String str = "aabbaccda";
		Stack<Character> st = new Stack<>();
		for (char c : str.toCharArray()) {
			if (!st.isEmpty() && st.peek() == c) {
				st.pop();
			} else {
				st.add(c);
			}
		}
		System.out.println(st);
	}
}
