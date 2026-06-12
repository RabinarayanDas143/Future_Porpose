package com.example.InterviewCoding26;

public class ReverseStringWordBasis26 {
	public static void main(String[] args) {
		String str = "I am a Java Developer";
		StringBuilder sb = new StringBuilder();
		String[] array = str.split(" ");
		for (int i = 0; i < array.length; i++) {
			String s = array[i];
			StringBuilder sb1 = new StringBuilder();
			for (int j = s.length() - 1; j >= 0; j--) {
				sb1.append(s.charAt(j));
			}
			sb.append(sb1).append(" ");
		}
		System.out.println(sb.toString());
	}
}
