package com.example.InterviewCoding12;

public class ReverseaNumbe12 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		while (num != 0) {
			int d = num % 10;
			sum=sum*10+d;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
