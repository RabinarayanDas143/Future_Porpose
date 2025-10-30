package com.example.java8CodingQuestion7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString7 {

	public static void main(String[] args) {

		String str = "Java hello";
		String revStr = Arrays.stream(str.split(" ")).map(e -> new StringBuilder(e).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(revStr);
	}

}
