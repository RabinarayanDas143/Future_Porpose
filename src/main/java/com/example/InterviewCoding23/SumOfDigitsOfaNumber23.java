package com.example.InterviewCoding23;

public class SumOfDigitsOfaNumber23 {
	public static void main(String[] args) {
		String str = "123";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum = sum + Character.getNumericValue(str.charAt(i));
		}
		System.out.println(sum);
	}
}
