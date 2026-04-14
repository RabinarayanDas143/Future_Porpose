package com.example.InterviewCoding18;

public class ReverseStringWordBasis18 {
	public static void main(String[] args) {
		String str = "I am a Java Developer";
		StringBuilder sb = new StringBuilder();
		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			String string = strArray[i];
			StringBuilder s = new StringBuilder();
			for (int j = string.length() - 1; j >= 0; j--) {
				s.append(string.charAt(j));
			}
			sb.append(s + " ");
		}
		System.out.println(sb.toString());
	}
}
