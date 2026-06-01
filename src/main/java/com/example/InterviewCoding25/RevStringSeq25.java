package com.example.InterviewCoding25;

public class RevStringSeq25 {
	public static void main(String[] args) {
		String str = "Welcome";
		String res = "";
		int count = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (count % 2 == 0) {
				res = res + Character.toLowerCase(ch);
			} else {
				res = res + Character.toUpperCase(ch);
			}
			count++;
		}
		System.out.println(res);
	}
}
