package com.example.InterviewCoding14;

public class ReverseStringWordBasis14 {
	public static void main(String[] args) {
		String str = "I am a Java Developer";
		StringBuilder sb = new StringBuilder();
		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			StringBuilder sb1 = new StringBuilder();
			String word = strArray[i];
			for (int j = word.length() - 1; j >= 0; j--) {
				sb1.append(word.charAt(j));
			}
			sb.append(sb1 + " ");
		}
		System.out.println(sb.toString());
	}
}
