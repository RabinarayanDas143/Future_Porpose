package com.example.InterviewCoding13;

public class ReverseStringWordBasis13 {
	public static void main(String[] args) {
		String str = "My Name is Rabi";
		String st[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < st.length; i++) {
			String rev = doReverse(st[i]);
			sb.append(rev+" ");
		}

		System.out.println(sb.toString());
	}

	private static String doReverse(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
