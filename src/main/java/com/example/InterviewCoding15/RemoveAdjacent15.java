package com.example.InterviewCoding15;

import java.util.Stack;

public class RemoveAdjacent15 {
	public static void main(String[] args) {
		String str = "abbaca";
		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			if (!stack.isEmpty() && stack.peek() == ch) {
				stack.pop();
			} else {
				stack.push(ch);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (char c : stack) {
			sb.append(c);
		}
		System.out.println(sb.toString());
	}
}
