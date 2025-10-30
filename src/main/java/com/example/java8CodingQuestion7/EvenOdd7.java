package com.example.java8CodingQuestion7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenOdd7 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		int[] evenArray = Arrays.stream(array).filter(e -> e % 2 == 0).boxed().collect(Collectors.toList()).stream()
				.mapToInt(e -> e).toArray();
		int[] oddArray = Arrays.stream(array).filter(e -> e % 2 != 0).boxed().collect(Collectors.toList()).stream()
				.mapToInt(e -> e).toArray();

		System.out.println("Even Array is :" + Arrays.toString(evenArray));
		System.out.println("Odd Array is :" + Arrays.toString(oddArray));
	}
}
