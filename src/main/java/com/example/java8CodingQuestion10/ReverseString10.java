package com.example.java8CodingQuestion10;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString10 {
	public static void main(String[] args) {
		String str = "Java hello";
		String strRev = Arrays.stream(str.split(" ")).map(e -> new StringBuilder(e).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(strRev); 
	}
}
