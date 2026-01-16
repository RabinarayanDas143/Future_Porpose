package com.example.java8CodingQuestion8;

import java.util.Arrays;

public class SumOfAllDigists8 {
	public static void main(String[] args) {
		String str = "123";
		int sum = Arrays.stream(str.split("")).mapToInt(e -> Integer.parseInt(e)).sum();
		System.out.println(sum);
	}
}
