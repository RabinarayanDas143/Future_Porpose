package com.example.InterviewCoding24;

public class AmstrongNumber23 {
	public static void main(String[] args) {
		int num = 153;
		int original = num;
		int sum = 0;
		while (num != 0) {
			int d = num % 10;
			sum = sum + d * d * d;
			num = num / 10;
		}
		if(original==sum)
			System.out.println("Amstrong");
		else
			System.out.println("Not");
	}
}
