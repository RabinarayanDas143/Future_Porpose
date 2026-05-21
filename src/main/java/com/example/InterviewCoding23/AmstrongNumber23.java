package com.example.InterviewCoding23;

public class AmstrongNumber23 {
	public static void main(String[] args) {
		int num = 153;
		int original = num;
		int sum = 0;
		while (num != 0) {
			int d = num % 10;
			sum =sum+ d * d * d;
			num = num / 10;
		}
		if(sum==original)
			System.out.println("Amstrong");
		else
			System.out.println("Nooo");
	}
}
