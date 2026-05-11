package com.example.InterviewCoding20;

import java.util.Stack;

public class RemoveAdjacent20 {
	public static void main(String[] args) {
		String str = "aabaabcs";
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (!st.isEmpty() && str.charAt(i) == st.peek())
				st.pop();
			else
				st.add(str.charAt(i));

		}
		System.out.println(st.toString());
	}
}
