package com.example.InterviewCoding24;

public class ReverseStringWordBasis24 {
	public static void main(String[] args) {
		String str = "I am a Java Developer";
		StringBuilder sb = new StringBuilder();
		String[] s = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			String s1 = s[i];
			StringBuilder sb1 = new StringBuilder();
			for (int j = s1.length() - 1; j >= 0; j--) {
				sb1.append(s1.charAt(j));
			}
			sb.append(sb1.append(" "));
		}
		System.out.println(sb.toString());
	}
}
