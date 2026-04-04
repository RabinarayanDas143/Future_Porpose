package com.example.java8CodingQuestion11;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString11 {
	public static void main(String[] args) {
		String str = "Java hello";
		String str1 = Arrays.stream(str.split(" ")).map(e -> new StringBuilder(e).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(str1);
	}
}
