package com.example.InterviewCoding16;

public class Next5Char16 {
	public static void main(String[] args) {
		char c = 'b';
		for (int i = 1; i <= 5; i++) {
			char ch = (char) (c + i);
			System.out.print(ch + " ,");
		}
	}
}
