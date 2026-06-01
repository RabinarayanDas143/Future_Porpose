package com.example.java8CodingQuestion14;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindSumAndAverageFromArray14 {
public static void main(String[] args) {
	int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int sum = Arrays.stream(array).boxed().collect(Collectors.summingInt(e->e));
	double average = Arrays.stream(array).boxed().collect(Collectors.averagingDouble(e->e));
	System.out.println(sum);
	System.out.println(average);
}
}
