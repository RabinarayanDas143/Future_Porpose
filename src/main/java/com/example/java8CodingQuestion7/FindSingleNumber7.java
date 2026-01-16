package com.example.java8CodingQuestion7;

import java.util.Arrays;

public class FindSingleNumber7 {
	public static void main(String[] args) {
		int[] array = { 4, 1, 3, 2, 1, 2, 3 };
		int singleNum = Arrays.stream(array).reduce(0, (a, b) -> a ^ b);
		System.out.println(singleNum);
	}
}
