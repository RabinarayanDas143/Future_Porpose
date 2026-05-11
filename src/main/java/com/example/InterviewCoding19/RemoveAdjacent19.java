package com.example.InterviewCoding19;

import java.util.Stack;

public class RemoveAdjacent19 {
public static void main(String[] args) {
	String str = "aabdbc";
	Stack<Character> st = new Stack<>();
	for(int i = 0;i<str.length();i++) {
		char c = str.charAt(i);
		if(!st.isEmpty() && st.peek()==c)
			st.pop();
		else
			st.add(c);
	}
	System.out.println(st);
}
}
