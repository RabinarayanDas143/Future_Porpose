package com.example.InterviewCoding26;

public class RevStringSeq26 {
	public static void main(String[] args) {
		String str = "Welcome";
		String res = "";
		for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
			char c = str.charAt(i);
			if (j % 2 == 0)
				res = res + Character.toLowerCase(c);
			else
				res = res + Character.toUpperCase(c);
		}
		System.out.println(res);
	}
}
