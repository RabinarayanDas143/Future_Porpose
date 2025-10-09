package com.example.InterviewCoding10;

public class ReverseStringWordBasis10 {
	public static void main(String[] args) {
		String str = "My Name is Rabi";
		String reverseStr = getReverseWordBasis(str);
		System.out.println(reverseStr);
	}

	public static String getReverseWordBasis(String str) {
		String[] array = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			StringBuilder sb1 = new StringBuilder();
			String s = array[i];
			for (int j = s.length() - 1; j >= 0; j--) {
				sb1.append(s.charAt(j));
			}
			sb.append(sb1 + " ");
		}
		return sb.toString();
	}
}
