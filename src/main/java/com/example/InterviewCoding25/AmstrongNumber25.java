package com.example.InterviewCoding25;

public class AmstrongNumber25 {
	public static void main(String[] args) {
		int num = 153;
		int actualnum = num;
		int sum = 0;
		while (num != 0) {
			int d = num % 10;
			sum = sum + d * d * d;
			num = num / 10;
		}
		if(actualnum==sum)
			System.out.println("Amstrong");
		else {
			System.out.println("Nooo");
		}
	}
}
