package com.example.InterviewCoding14;

import java.util.Stack;

public class RemoveAdjacent14 {
	public static void main(String[] args) {
		String str = "abbaca";
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (char c : stack) {
			sb.append(c);
		}
		System.out.println(sb.toString());
	}
}
