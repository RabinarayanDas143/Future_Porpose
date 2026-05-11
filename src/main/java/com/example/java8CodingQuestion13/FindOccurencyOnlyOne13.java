package com.example.java8CodingQuestion13;

import java.util.List;
import java.util.stream.Collectors;

public class FindOccurencyOnlyOne13 {
	public static void main(String[] args) {
		String str = "Programming";
		List<Character> list = str.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println(list);
	}
}
