package com.example.InterviewCoding15;

public class FactorialsNumber15 {
	public static void main(String[] args) {
		int num = 10;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial number is :" + fact);
	}
}
