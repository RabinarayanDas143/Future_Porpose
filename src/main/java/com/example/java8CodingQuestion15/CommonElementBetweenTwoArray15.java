package com.example.java8CodingQuestion15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementBetweenTwoArray15 {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] array2 = { 1, 2, 3, 4, 5 };

		List<Integer> list = Arrays.stream(array2).boxed()
				.filter(e -> Arrays.stream(array1).boxed().collect(Collectors.toList()).contains(e))
				.collect(Collectors.toList());
		System.out.println(list);
	}
}
