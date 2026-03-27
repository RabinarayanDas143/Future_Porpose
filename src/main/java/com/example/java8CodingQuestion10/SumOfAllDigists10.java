package com.example.java8CodingQuestion10;

import java.util.Arrays;

public class SumOfAllDigists10 {
	public static void main(String[] args) {
		String num = "123";
		int sumAll = Arrays.stream(num.split("")).map(e -> Integer.parseInt(e)).reduce(0, (a, b) -> a + b);
		System.out.println(sumAll);
	}
}
