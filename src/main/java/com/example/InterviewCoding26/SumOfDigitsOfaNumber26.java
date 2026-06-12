package com.example.InterviewCoding26;

public class SumOfDigitsOfaNumber26 {
	public static void main(String[] args) {
		String str = "123";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += Character.getNumericValue(str.charAt(i));
		}
		System.out.println("Sum is :" + sum);
	}
}
