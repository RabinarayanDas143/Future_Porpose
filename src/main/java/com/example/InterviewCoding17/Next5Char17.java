package com.example.InterviewCoding17;

public class Next5Char17 {
	public static void main(String[] args) {
		char ch = 'd';
		for (int i = 1; i <= 5; i++) {
			char n = (char) (ch + i);
			System.out.print(n + ",");
		}
	}
}
