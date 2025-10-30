package com.example.java8CodingQuestion7;

import java.util.Arrays;
import java.util.OptionalDouble;

public class FindSumAndAverageFromArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		int sum = Arrays.stream(array).boxed().reduce(0, (a,b)->a+b).intValue();
		System.out.println(sum);
		
		int sum1 = Arrays.stream(array).boxed().mapToInt(e->e).sum();
		System.out.println(sum1);
		
		OptionalDouble average = Arrays.stream(array).boxed().mapToDouble(e->e).average();
		System.out.println(average);
	}

}
