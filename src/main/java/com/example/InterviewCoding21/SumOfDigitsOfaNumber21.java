package com.example.InterviewCoding21;

public class SumOfDigitsOfaNumber21 {
public static void main(String[] args) {
	String str = "123";
	int sum=0;
	for(int i=0;i<str.length();i++) {
		int d = Character.getNumericValue(str.charAt(i));
		sum = sum+d;
	}
	System.out.println(sum);
}
}
