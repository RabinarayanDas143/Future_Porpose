package com.example.InterviewCoding18;

public class FactorialsNumber18 {
	public static void main(String[] args) {
		int num = 10;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial number is :" + fact);
	}
}
