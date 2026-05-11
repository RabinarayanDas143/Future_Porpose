package com.example.InterviewCoding20;

public class Next5Char20 {
	public static void main(String[] args) {
		char ch = 'd';
		for (int i = 1; i <= 5; i++) {
			char c = (char) (ch + i);
			System.out.print(c + ",");
		}
	}
}
