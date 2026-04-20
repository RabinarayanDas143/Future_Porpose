package com.example.InterviewCoding19;

public class FactorialsNumber19 {
	public static void main(String[] args) {
		int num = 10;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial num is :" + fact);
	}
}
