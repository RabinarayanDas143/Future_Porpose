package com.example.InterviewCoding11;

public class ReverseStringWordBasis11 {
	public static void main(String[] args) {
		String str = "My Name is Rabi";
		String result = getReverse(str);
		System.out.println(result);
	}

	public static String getReverse(String str) {
		StringBuilder sb = new StringBuilder();
		String[] st = str.split(" ");
		for (int i = 0; i < st.length; i++) {
			String s = doReverse(st[i]);
			sb.append(s + " ");
		}
		return sb.toString();
	}

	private static String doReverse(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
