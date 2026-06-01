package com.example.InterviewCoding25;

public class ReverseStringWordBasis25 {
	public static void main(String[] args) {
		String str = "I am a Java Developer";
		StringBuilder sb = new StringBuilder();
		String[] array = str.split(" ");
		for (String s : array) {
			StringBuilder sb1 = new StringBuilder();
			for (int i = s.length() - 1; i >= 0; i--) {
				sb1.append(s.charAt(i));
			}
			sb.append(sb1+" ");
		}
		System.out.println(sb.toString());
	}
}
