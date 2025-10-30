package com.example.java8CodingQuestion7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CommonElementBetweenTwoArray7 {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 3, 4, 5, 6, 7, 8 };
		
		Predicate<Integer> p = e->Arrays.stream(array2).boxed().collect(Collectors.toList()).contains(e);
		List<Integer> list = Arrays.stream(array1).boxed().filter(p).collect(Collectors.toList());
		
		list.forEach(System.out::println);
	}
}
