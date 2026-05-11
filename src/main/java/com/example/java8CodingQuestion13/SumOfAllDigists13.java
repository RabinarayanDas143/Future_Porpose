package com.example.java8CodingQuestion13;

import java.util.Arrays;

public class SumOfAllDigists13 {
	public static void main(String[] args) {
		String str = "123";
		int num = Arrays.stream(str.split("")).map(e -> Integer.parseInt(e)).reduce(0, (a, b) -> a + b);
		System.out.println(num);
	}
}
