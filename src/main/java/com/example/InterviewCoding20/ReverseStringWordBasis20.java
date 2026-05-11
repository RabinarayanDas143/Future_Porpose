package com.example.InterviewCoding20;

public class ReverseStringWordBasis20 {
	public static void main(String[] args) {
		String str = "I am a Java Developer";
		StringBuilder sb = new StringBuilder();
		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			StringBuilder s = new StringBuilder();
			for (int j = strArray[i].length() - 1; j >= 0; j--) {
				s.append(strArray[i].charAt(j));
			}
			sb.append(s + " ");
		}
		System.out.println(sb.toString());
	}
}
