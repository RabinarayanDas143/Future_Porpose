package com.example.InterviewCoding20;

public class FactorialsNumber20 {
	public static void main(String[] args) {
		int num = 10;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial number is :" + fact);
	}
}
