package com.example.java8CodingQuestion15;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllDigists15 {
	public static void main(String[] args) {
		String str = "123";
		int sum = str.chars().map(e -> Character.getNumericValue(e)).reduce(0, (a, b) -> a + b);
		System.out.println(sum);

		int sum1 = Arrays.stream(str.split("")).map(e -> Integer.parseInt(e)).collect(Collectors.summingInt(e -> e));
		System.out.println(sum1);
	}
}
