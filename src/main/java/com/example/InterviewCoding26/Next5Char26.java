package com.example.InterviewCoding26;

public class Next5Char26 {
	public static void main(String[] args) {
		char c = 'e';
		for (int i = 1; i <= 5; i++) {
			char ch = (char) (c + i);
			System.out.print(ch + ",");
		}
	}
}
