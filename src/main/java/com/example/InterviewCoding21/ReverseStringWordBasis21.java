package com.example.InterviewCoding21;

public class ReverseStringWordBasis21 {
	public static void main(String[] args) {
		String str = "I am a java Developer";
		StringBuilder sb = new StringBuilder();
		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			StringBuilder sb1 = new StringBuilder();
			String s = strArray[i];
			for (int j = s.length() - 1; j >= 0; j--) {
				sb1.append(strArray[i].charAt(j));
			}
			sb.append(sb1 + " ");
		}
		System.out.println(sb.toString());
	}
}
