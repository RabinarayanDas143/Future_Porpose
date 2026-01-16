package com.example.InterviewCoding12;

public class FactorialsNumber12 {
	public static void main(String[] args) {
		int fact = 10;
		int factorial = getFactorialNumber(fact);
		System.out.println("FactorialNumber is : " + factorial);
	}

	private static int getFactorialNumber(int fact) {
		int factorial=1;
		for(int i=1;i<=fact;i++) {
			factorial=factorial*i;
		}
		return factorial;
	}
}
