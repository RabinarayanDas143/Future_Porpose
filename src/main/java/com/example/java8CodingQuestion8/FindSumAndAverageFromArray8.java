package com.example.java8CodingQuestion8;

import java.util.Arrays;
import java.util.OptionalDouble;

public class FindSumAndAverageFromArray8 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = Arrays.stream(array).boxed().reduce(0, (a,b)->a+b).intValue();
		OptionalDouble average = Arrays.stream(array).boxed().mapToLong(e->e).average();
		
		System.out.println(sum);
		System.out.println(average);
	}
}
