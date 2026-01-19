package com.example.java8CodingQuestion9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd9 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		List<Integer> evenList = Arrays.stream(array).boxed().filter(e -> e % 2 == 0).collect(Collectors.toList());
		List<Integer> oddList = Arrays.stream(array).boxed().filter(e -> e % 2 != 0).collect(Collectors.toList());
		System.out.println("evenList :" + evenList);
		System.out.println("oddList :" + oddList);
	}
}
