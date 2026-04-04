package com.example.java8CodingQuestion11;

import java.util.Arrays;

public class SumOfAllDigists11 {
	public static void main(String[] args) {
		String str = "123";
		int sum = Arrays.stream(str.split("")).map(e -> Integer.parseInt(e)).reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}
}
