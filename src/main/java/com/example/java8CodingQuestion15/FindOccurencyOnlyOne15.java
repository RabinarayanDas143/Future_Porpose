package com.example.java8CodingQuestion15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOccurencyOnlyOne15 {
	public static void main(String[] args) {
		String str = "Programming";
		List<String> list = Arrays.stream(str.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println(list);
	}
}
