package com.example.java8CodingQuestion12;

import java.util.Arrays;

public class SumOfAllDigists12 {
	public static void main(String[] args) {
		String num = "123";
		int sum = Arrays.stream(num.split("")).mapToInt(e -> Integer.parseInt(e)).reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}
}
