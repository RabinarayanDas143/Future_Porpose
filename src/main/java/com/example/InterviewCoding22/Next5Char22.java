package com.example.InterviewCoding22;

public class Next5Char22 {
	public static void main(String[] args) {
		char c = 'g';
		for (int i = 1; i <= 5; i++) {
			char c1 = (char) (c + i);
			System.out.print(c1 + ",");
		}
	}
}
