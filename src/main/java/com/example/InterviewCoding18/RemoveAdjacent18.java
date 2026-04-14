package com.example.InterviewCoding18;

import java.util.Stack;

public class RemoveAdjacent18 {
	public static void main(String[] args) {
		String str = "aabbada";
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if(!st.isEmpty() && st.peek()==str.charAt(i))
				st.pop();
			else
				st.add(str.charAt(i));
		}
		System.out.println(st);
	}
}
