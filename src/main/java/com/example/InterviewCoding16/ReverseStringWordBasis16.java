package com.example.InterviewCoding16;

public class ReverseStringWordBasis16 {
	public static void main(String[] args) {
		String str = "I am a Java Developer";
		StringBuilder sb = new StringBuilder();
		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			String s = strArray[i];
			StringBuilder sb1 = new StringBuilder();
			for (int j = s.length() - 1; j >= 0; j--) {
				sb1.append(s.charAt(j));
			}
			sb.append(sb1 + " ");
		}

		System.out.println(sb.toString());
	}
}
