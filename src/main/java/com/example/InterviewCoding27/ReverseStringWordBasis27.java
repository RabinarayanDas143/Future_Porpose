package com.example.InterviewCoding27;

public class ReverseStringWordBasis27 {
	public static void main(String[] args) {
		String str = "I am a java Developer";
		StringBuilder sb = new StringBuilder();
		for (String s : str.split(" ")) {
			StringBuilder sb1 = new StringBuilder();
			for (int i = s.length() - 1; i >= 0; i--) {
				sb1.append(s.charAt(i));
			}
			sb.append(sb1).append(" ");
		}
		System.out.println(sb.toString());
	}
}
