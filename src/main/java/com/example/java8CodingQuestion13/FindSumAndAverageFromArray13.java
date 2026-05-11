package com.example.java8CodingQuestion13;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindSumAndAverageFromArray13 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = Arrays.stream(array).reduce(0, (a, b) -> a + b);
		double average = Arrays.stream(array).boxed().collect(Collectors.averagingDouble(e -> e));
		System.out.println("sum :" + sum);
		System.out.println("average :" + average);
	}
}
