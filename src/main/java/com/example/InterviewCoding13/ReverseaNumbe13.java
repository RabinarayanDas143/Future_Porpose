package com.example.InterviewCoding13;

public class ReverseaNumbe13 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		while (num != 0) {
			int d = num % 10;
			sum = sum * 10 + d;
			num = num / 10;
		}
		System.out.println(sum);
	}
}


