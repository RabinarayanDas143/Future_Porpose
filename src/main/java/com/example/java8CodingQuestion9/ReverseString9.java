package com.example.java8CodingQuestion9;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString9 {
	public static void main(String[] args) {
		String str = "Java hello";
		String result = Arrays.stream(str.split(" ")).map(e -> new StringBuilder(e).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(result);
	}
}
