package com.example.java8CodingQuestion12;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString12 {
	public static void main(String[] args) {
		String str = "Java Developer";
		String s = Arrays.stream(str.split(" ")).map(e -> new StringBuilder(e).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(s);
	}
}
