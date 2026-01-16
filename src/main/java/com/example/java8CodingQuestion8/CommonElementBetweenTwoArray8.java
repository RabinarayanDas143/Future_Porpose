package com.example.java8CodingQuestion8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CommonElementBetweenTwoArray8 {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 3, 4, 5, 6, 7, 8 };

		Predicate<Integer> test = e -> Arrays.stream(array2).boxed().collect(Collectors.toList()).contains(e);
		List<Integer> list = Arrays.stream(array1).boxed().filter(test).collect(Collectors.toList());
		System.out.println(list);
	}
}
