package com.example.InterviewCoding19;

public class FindFirstCharFromWord19 {
	public static void main(String[] args) {
		String str = "I am a Java Developer";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 || str.charAt(i - 1) == ' ')
				sb.append(str.charAt(i) + " ");
		}
		System.out.println(sb.toString());
	}
}
