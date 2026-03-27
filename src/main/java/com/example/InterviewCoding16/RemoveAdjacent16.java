package com.example.InterviewCoding16;

import java.util.Stack;

public class RemoveAdjacent16 {
	public static void main(String[] args) {
		String str = "abbaca";
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (!st.isEmpty() && st.peek() == str.charAt(i)) {
				st.pop();
			}else {
				st.push(str.charAt(i));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c : st) {
			sb.append(c);
		}
		System.out.println(sb.toString());
	}
}
