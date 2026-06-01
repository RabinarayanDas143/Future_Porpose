package com.example.java8CodingQuestion14;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllDigists14 {
	public static void main(String[] args) {
		String str = "123";
		int num = Arrays.stream(str.split("")).map(e -> Integer.parseInt(e)).collect(Collectors.summingInt(e -> e));
		System.out.println(num);
	}
}
