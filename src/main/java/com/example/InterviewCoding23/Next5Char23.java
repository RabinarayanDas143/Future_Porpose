package com.example.InterviewCoding23;

public class Next5Char23 {
	public static void main(String[] args) {
		char c = 'f';
		for (int i = 1; i <= 5; i++) {
			char d = (char) (c + i);
			System.out.print(d + ",");
		}
	}
}
