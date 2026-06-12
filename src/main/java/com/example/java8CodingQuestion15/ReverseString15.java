package com.example.java8CodingQuestion15;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString15 {
	public static void main(String[] args) {
		String str = "I am a Java Developer";
		String res = Arrays.stream(str.split(" ")).map(e -> new StringBuilder(e).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(res);
	}
}
