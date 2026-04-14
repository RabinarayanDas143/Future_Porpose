package com.example.InterviewCoding18;

public class Next5Char18 {
	public static void main(String[] args) {
		char c = 'd';
		for (int i = 1; i <= 5; i++) {
			char c1 = (char) (c + i);
			System.out.print(c1 + ",");
		}
	}
}
