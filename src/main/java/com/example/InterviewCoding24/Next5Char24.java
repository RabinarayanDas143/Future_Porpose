package com.example.InterviewCoding24;

public class Next5Char24 {
	public static void main(String[] args) {
		char c = 'e';
		for (int i = 1; i <= 5; i++) {
			char d = (char) (c + i);
			System.out.print(d + ",");
		}
	}
}
