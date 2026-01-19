package com.example.java8CodingQuestion9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementBetweenTwoArray9 {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 3, 4, 5, 6, 7, 8 };
		List<Integer> list = Arrays.stream(array1).boxed().filter(e -> Arrays.stream(array2).anyMatch(x -> x == e))
				.collect(Collectors.toList());
		System.out.println(list);
	}
}
